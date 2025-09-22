package com.securityexample.security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v/loan")
public class LoanController {

    @GetMapping("/my-loan")
    public String getMyLoan() {
        return "my loan";
    }
}
