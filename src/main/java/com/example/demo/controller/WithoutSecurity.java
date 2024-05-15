package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WithoutSecurity {
    @RequestMapping(method = RequestMethod.GET)
    public void getTest() {
        System.out.printf("Without security");
    }
}
