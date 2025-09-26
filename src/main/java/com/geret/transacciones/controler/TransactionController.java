package com.geret.transacciones.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.geret.transacciones.dto.TransactionDTO;
import com.geret.transacciones.error.AccountNotFoundException;
import com.geret.transacciones.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
	public TransactionDTO createTransaction(@RequestBody TransactionDTO transactionDTO) throws AccountNotFoundException {
        return transactionService.createTransaction(transactionDTO);
    }
}
