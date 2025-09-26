package com.geret.transacciones.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geret.transacciones.domain.Account;
import com.geret.transacciones.domain.Transaction;
import com.geret.transacciones.dto.TransactionDTO;
import com.geret.transacciones.error.AccountNotFoundException;
import com.geret.transacciones.mapper.TransactionMapper;
import com.geret.transacciones.repository.AccountRepository;
import com.geret.transacciones.repository.TransactionRepository;
import com.geret.transacciones.service.TransactionService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionMapper transactionMapper;

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Override
	public TransactionDTO createTransaction(TransactionDTO transactionDTO) throws AccountNotFoundException {
        log.info("Iniciar creación de transacción: {}", transactionDTO);
        transactionDTO.setCode(null);

        Optional<Account> accountOptional = accountRepository.findById(transactionDTO.getAccountId());
        if(accountOptional.isEmpty()) {
            log.error("Cuenta no encontrada con id: {}", transactionDTO.getAccountId());
            throw new AccountNotFoundException("Account not found with id: " + transactionDTO.getAccountId());
        }

        Transaction newTransaction = transactionMapper.mapDtoToEntity(transactionDTO);
        return transactionMapper.mapEntityToDto(transactionRepository.save(newTransaction));
    }
}
