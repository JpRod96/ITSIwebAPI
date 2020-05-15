package com.ITSI.itsiweb.controllers.accountability;

import com.ITSI.itsiweb.entities.accountability.Account;
import com.ITSI.itsiweb.services.accountability.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.ITSI.itsiweb.utils.RoleAuthorizationConstants.*;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    private final String ACCOUNT_PATH = "/account";

    @PreAuthorize(ACCOUNTANT)
    @GetMapping(ACCOUNT_PATH + "/rootaccounts")
    public List<Account> getRootAccount(){
        return accountService.getRootAccounts();
    }
}
