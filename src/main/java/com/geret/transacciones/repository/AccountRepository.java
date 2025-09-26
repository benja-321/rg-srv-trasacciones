package com.geret.transacciones.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.geret.transacciones.domain.Account;

public interface AccountRepository extends MongoRepository<Account, String> {

}
