package com.anx.reconciliation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.anx.reconciliation.entity.Transaction;


public interface TransactionRepository extends MongoRepository<Transaction, String> , CrudRepository<Transaction, String> {

}
