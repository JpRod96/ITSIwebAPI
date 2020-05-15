package com.ITSI.itsiweb.services.accountability.account;

import com.ITSI.itsiweb.entities.accountability.Account;
import com.ITSI.itsiweb.repositories.accountability.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAllFrom(int level){
        return accountRepository.getAllFrom(level);
    }
}
