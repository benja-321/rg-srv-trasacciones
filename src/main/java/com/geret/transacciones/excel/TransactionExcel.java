package com.geret.transacciones.excel;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionExcel {

	private String code;
	private String category;
	private String type;
	private String description;
	private Double amount;
	private LocalDate date;
}
