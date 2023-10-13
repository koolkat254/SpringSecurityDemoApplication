package com.koolkat254.springSecurityDemo.controller;

import com.koolkat254.springSecurityDemo.model.Customer;
import com.koolkat254.springSecurityDemo.model.Loans;
import com.koolkat254.springSecurityDemo.repository.CustomerRepository;
import com.koolkat254.springSecurityDemo.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoansController {

    @Autowired
    private LoanRepository loanRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/myLoans")
    public List<Loans> getLoanDetails(@RequestParam String email) {
        Customer customer = customerRepository.findByEmail(email);
        if (customer != null) {
            List<Loans> loans = loanRepository.findByCustomerIdOrderByStartDateDesc(customer.getId());
            if (loans != null ) {
                return loans;
            }
        }
        return null;
    }

}
