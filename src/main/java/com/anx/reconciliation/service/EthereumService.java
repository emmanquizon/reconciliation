package com.anx.reconciliation.service;

import java.io.IOException;

import com.anx.reconciliation.entity.TxTransaction;

public interface EthereumService {

	public void checkTransaction(TxTransaction transaction) throws IOException;
}
