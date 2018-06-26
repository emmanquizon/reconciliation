package com.anx.reconciliation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.anx.reconciliation.entity.TxTransaction;

public interface TxTransactionRepository extends MongoRepository<TxTransaction, String>, CrudRepository<TxTransaction, String> {

}
