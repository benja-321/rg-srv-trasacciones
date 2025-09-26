package com.geret.transacciones.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.geret.transacciones.domain.Transaction;

public interface TransactionRepository extends MongoRepository<Transaction, String> {

}
