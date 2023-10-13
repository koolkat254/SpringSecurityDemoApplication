package com.koolkat254.springSecurityDemo.controller;

import com.koolkat254.springSecurityDemo.model.Accounts;
import com.koolkat254.springSecurityDemo.model.Customer;
import com.koolkat254.springSecurityDemo.repository.AccountsRepository;
import com.koolkat254.springSecurityDemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountsRepository accountsRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/myAccount")
    public Accounts getAccountDetails(@RequestParam String email) {
        Customer customer = customerRepository.findByEmail(email);
        if (customer != null) {
            Accounts accounts = accountsRepository.findByCustomerId(customer.getId());
            if (accounts != null) {
                return accounts;
            }
        }
        return null;
    }
}
