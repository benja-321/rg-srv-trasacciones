package com.geret.transacciones.mapper;

import org.mapstruct.Mapper;

import com.geret.transacciones.domain.Transaction;
import com.geret.transacciones.dto.TransactionDTO;

@Mapper
public interface TransactionMapper {

	Transaction mapDtoToEntity(TransactionDTO transaction);
	
	TransactionDTO mapEntityToDto(Transaction transaction);
}
