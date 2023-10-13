package com.koolkat254.springSecurityDemo.controller;

import com.koolkat254.springSecurityDemo.model.AccountTransactions;
import com.koolkat254.springSecurityDemo.model.Customer;
import com.koolkat254.springSecurityDemo.repository.AccountTransactionsRepository;
import com.koolkat254.springSecurityDemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BalanceController {

    @Autowired
    private AccountTransactionsRepository accountTransactionsRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/myBalance")
    public List<AccountTransactions> getBalanceDetails(@RequestParam String email) {
        Customer customer = customerRepository.findByEmail(email);
        if (customer != null) {
            List<AccountTransactions> accountTransactions = accountTransactionsRepository.
                    findByCustomerIdOrderByTransactionDateDesc(customer.getId());
            if (accountTransactions != null) {
                return accountTransactions;
            }
        }
        return null;
    }
}
