package com.geret.transacciones.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "cuentas")
public class Account implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("titulo")
    private String title;

    @Field("banco")
    private String bank;

    @Field("moneda")
    private String currency;

    @Field("saldo")
    private Double balance;
}
