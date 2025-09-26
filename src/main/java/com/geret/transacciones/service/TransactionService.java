package com.geret.transacciones.service;

import com.geret.transacciones.dto.TransactionDTO;
import com.geret.transacciones.error.AccountNotFoundException;

public interface TransactionService {

    TransactionDTO createTransaction(TransactionDTO transactionDTO) throws AccountNotFoundException;
}
