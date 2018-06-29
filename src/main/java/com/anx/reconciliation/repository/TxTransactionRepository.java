package com.anx.reconciliation.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.anx.reconciliation.entity.TxTransaction;

public interface TxTransactionRepository extends MongoRepository<TxTransaction, String>, CrudRepository<TxTransaction, String>{
	
	public Page<TxTransaction> findByTxnId(@Param("txnId") String txnId,Pageable pageable);

}
