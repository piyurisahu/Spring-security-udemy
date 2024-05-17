package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class BalanceController {
    @GetMapping("/myBalance")
    public String getAccountDetails() {
        return "Here is balance";
    }
}
