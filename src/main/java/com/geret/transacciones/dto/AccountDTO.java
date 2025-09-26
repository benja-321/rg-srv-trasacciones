package com.geret.transacciones.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    private String id;
    private String title;
    private String bank;
    private String currency;
    private Double balance;
}
