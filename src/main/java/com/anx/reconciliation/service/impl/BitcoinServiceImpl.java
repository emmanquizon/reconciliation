package com.anx.reconciliation.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anx.reconciliation.service.BitcoinService;
import com.anx.reconciliation.entity.BitcoinTransaction;
import com.anx.reconciliation.entity.TxInput;
import com.anx.reconciliation.entity.TxOutput;
import com.anx.reconciliation.entity.TxTransaction;
import com.anx.reconciliation.repository.TxTransactionRepository;
import com.anx.reconciliation.util.ApiUtil;
import com.anx.reconciliation.util.BitcoinMath;
import com.anx.reconciliation.util.CsvToJson;
import com.anx.reconciliation.util.PropertyUtil;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

@Service
public class BitcoinServiceImpl implements BitcoinService{

	public static final String BITCOIN_TEST_HOST = PropertyUtil.getProps("bitcoin.url.test");
	public static final String BITCOIN_TX_API = "rawtx/";
	public static final String BITCOIN_TXFEE_API = "q/txfee/";
	
	@Autowired
	TxTransactionRepository txTransactionRepository;
	
	@Override
	public void runBtcChecker() {

		File input = new File(PropertyUtil.getProps("excel.file.path"));
		BitcoinService btcService = new BitcoinServiceImpl();
		Gson gson = new Gson();
		List<Map<?, ?>> data;
		try {
			data = CsvToJson.readObjectsFromCsv(input);
			JsonParser jsonParser = new JsonParser();
			JsonArray arrayFromString = jsonParser.parse(gson.toJson(data)).getAsJsonArray();
			List<TxTransaction> transactionList = new ArrayList<TxTransaction>();
			
			for(JsonElement json : arrayFromString) {
				transactionList.add(gson.fromJson(json, TxTransaction.class));
			}
			int index = 1;
			for(TxTransaction t : transactionList) {
				//check where
				BitcoinTransaction btcTx = btcService.getTransactionDetails(t.getTxnId());

				System.out.println(t);
				System.out.println(btcTx);

				boolean hasMatch = false;
				boolean valid = false;
				if(btcTx != null) {
					if(t.getType().equalsIgnoreCase("Send")) {//Out
						for(TxOutput o : btcTx.getOutputs()) {
							
							if(o.getToAddress().equals(t.getAddress())){
								if(BitcoinMath.satoshiToBtc(Long.valueOf(o.getValue())).compareTo(t.getAmount()) == 0 &&
										BitcoinMath.satoshiToBtc(Long.valueOf(btcTx.getTransactionFee())).compareTo(t.bigDecimalFee().abs()) == 0  && 
										btcTx.getCreateDateTime() == Long.valueOf(t.getTime())){
										System.out.println("line "+index++  +" valid");
										valid = true;
								}else {
									System.out.println("line "+index++ +" invalid");
								}
								hasMatch = true;
							}
						}
						
						if(!hasMatch) {
							System.out.println("incorrect to address in line "+index++ );
						}
					}else if(t.getType().equalsIgnoreCase("Receive")) {//In
						for(TxInput i : btcTx.getInputs()) {
							
							if(i.getToAddress().equals(t.getAddress())){
								if(BitcoinMath.satoshiToBtc(Long.valueOf(i.getValue())).compareTo(t.getAmount()) == 0 && 
										btcTx.getCreateDateTime() == Long.valueOf(t.getTime())){
										System.out.println("line "+index++  +" valid");
										valid = true;
								}else {
									System.out.println("line "+index++ +" invalid");
								}
								hasMatch = true;
							}
						}
						
						if(!hasMatch) {
							System.out.println("incorrect to address in line "+index++ );
						}
					}
				}
				t.setHasMatched(valid);
				txTransactionRepository.save(t);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	public BitcoinTransaction getTransactionDetails(String txId) throws JSONException {
		Gson gson = new Gson();
		JSONObject json = ApiUtil.callApi(BITCOIN_TEST_HOST+BITCOIN_TX_API+txId);
		BitcoinTransaction btc = gson.fromJson(json.toString(), BitcoinTransaction.class);

		List<TxOutput> out = new ArrayList<TxOutput>();
		//int i = 0; i < arr.length(); i++
		JSONArray jarrOut = json.getJSONArray("out");
		for(int i = 0; i < jarrOut.length(); i++) {
			out.add(gson.fromJson(jarrOut.get(i).toString(), TxOutput.class));
		}
		
		List<TxInput> in = new ArrayList<TxInput>();
		JSONArray jarrIn = json.getJSONArray("inputs");
		for(int i = 0; i < jarrIn.length(); i++) {
			Object prev_out = new JSONObject(jarrIn.get(i).toString()).get("prev_out");
			in.add(gson.fromJson(prev_out.toString(), TxInput.class));
		}
		btc.setInputs(in);
		btc.setOutputs(out);
		
		long txFee = Long.valueOf(ApiUtil.callApiStr(BITCOIN_TEST_HOST+BITCOIN_TXFEE_API+txId));
		
		btc.setTransactionFee(txFee);
		
		return btc;
	}

	
}
