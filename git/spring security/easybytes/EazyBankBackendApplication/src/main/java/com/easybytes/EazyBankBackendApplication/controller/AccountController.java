package com.easybytes.EazyBankBackendApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/myAccounts")
    public String getAccountDetails(){
        return "here are account details from the db";
    }
}
