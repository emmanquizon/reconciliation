package com.anx.reconciliation.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.anx.reconciliation.entity.TxTransaction;

public class AnxUtil {

	public static boolean isNotNullNorEmpty(String val) {
		return val != null && !val.isEmpty();
	}
	
	public static List<TxTransaction> importCsvFile() {
		List<TxTransaction> transactions = new ArrayList<TxTransaction>();
		String csvFile = "C://temp/transactions.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {
			boolean firstRow = true;
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				if(firstRow) {
					firstRow = false;
				} else {
					String[] col = line.split(cvsSplitBy, -1);
					TxTransaction tran = new TxTransaction();
					tran.setTxnId(col[0]);
					tran.setTime(col[1]);
					tran.setAddress(col[2]);
					tran.setType(col[3]);
					if(AnxUtil.isNotNullNorEmpty(col[4])) {
						tran.setAmount(col[4]);
					}
					if(AnxUtil.isNotNullNorEmpty(col[5])) {
						tran.setFee(col[5]);
					}
					transactions.add(tran);
				}
				
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return transactions;

	}
}
