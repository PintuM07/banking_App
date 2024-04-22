package com.minibank.service;

import com.minibank.dto.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long Id);

    AccountDto deposit(Long id,Double total);

    AccountDto withdraw(Long id,Double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);

}
