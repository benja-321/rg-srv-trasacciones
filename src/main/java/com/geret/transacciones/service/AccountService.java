package com.geret.transacciones.service;

import com.geret.transacciones.dto.AccountDTO;
import com.geret.transacciones.error.AccountNotFoundException;

public interface AccountService {

    AccountDTO createAccount(AccountDTO accountDTO);

    AccountDTO getAccountById(String accountId) throws AccountNotFoundException;
}
