package com.anx.reconciliation.service;

import org.json.JSONException;

import com.anx.reconciliation.entity.BitcoinTransaction;


public interface BitcoinService {

	public BitcoinTransaction getTransactionDetails(String txId) throws JSONException;

	public void runBtcChecker();

}
