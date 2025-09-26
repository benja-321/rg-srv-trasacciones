package com.geret.transacciones.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geret.transacciones.domain.Account;
import com.geret.transacciones.dto.AccountDTO;
import com.geret.transacciones.error.AccountNotFoundException;
import com.geret.transacciones.mapper.AccountMapper;
import com.geret.transacciones.repository.AccountRepository;
import com.geret.transacciones.service.AccountService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public AccountDTO createAccount(AccountDTO accountDTO) {
        log.info("Iniciar creación de cuenta: {}", accountDTO);
        accountDTO.setId(null);
        return accountMapper.mapEntityToDto(accountRepository.save(accountMapper.mapDtoToEntity(accountDTO)));
    }

    @Override
    public AccountDTO getAccountById(String accountId) throws AccountNotFoundException {
        log.info("Obteniendo cuenta con id: {}", accountId);
        Optional<Account> accountOptional = accountRepository.findById(accountId);
        if(accountOptional.isEmpty()) {
            log.error("Cuenta no encontrada con id: {}", accountId);
            throw new AccountNotFoundException("Account not found with id: " + accountId);
        }
        return accountMapper.mapEntityToDto(accountOptional.get());
    }
}
