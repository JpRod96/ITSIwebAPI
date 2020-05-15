package com.ITSI.itsiweb.controllers.accountability;

import com.ITSI.itsiweb.entities.accountability.Account;
import com.ITSI.itsiweb.services.accountability.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.ITSI.itsiweb.utils.RoleAuthorizationConstants.*;
import static com.ITSI.itsiweb.utils.WebPathsConstants.*;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    private final int ROOT_ACCOUNT_LEVEL = 1;

    @PreAuthorize(ACCOUNTANT + OR + AUXILIARY_ACCOUNTANT)
    @GetMapping(ACCOUNT_PATH + "/rootaccounts")
    public List<Account> getRootAccount(){
        return accountService.getAllFrom(ROOT_ACCOUNT_LEVEL);
    }
}
