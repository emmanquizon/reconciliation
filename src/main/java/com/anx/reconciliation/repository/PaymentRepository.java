package com.anx.reconciliation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.anx.reconciliation.entity.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String>, CrudRepository<Payment, String> {

}
