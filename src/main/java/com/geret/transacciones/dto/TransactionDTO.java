package com.geret.transacciones.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO implements Serializable {

	private static final long serialVersionUID = 492843586166501638L;

	private String code;
	private String category;
	private String type;
	private String description;
	private Double amount;
	private LocalDate date;
}