package com.geret.transacciones.mapper;

import org.mapstruct.Mapper;

import com.geret.transacciones.domain.Account;
import com.geret.transacciones.dto.AccountDTO;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    AccountDTO mapEntityToDto(Account account);

    Account mapDtoToEntity(AccountDTO accountDTO);
}
