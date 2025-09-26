package com.geret.transacciones.domain;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "transacciones")
public class Transaction implements Serializable {

	private static final long serialVersionUID = 492843586166501638L;

	@Id
	private String code;

	@Field("categoria")
	private String category;

	@Field("tipo")
	private String type;

	@Field("descripcion")
	private String description;

	@Field("monto")
	private Double amount;

	@Field("fecha")
	private LocalDate date;

	@Field("cuenta")
	private String accountId;
}