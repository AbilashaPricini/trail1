package com.easybytes.EazyBankBackendApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/myBalances")
    public String getBalanceDetails(){
        return "here are the balance details from db";
    }
}
