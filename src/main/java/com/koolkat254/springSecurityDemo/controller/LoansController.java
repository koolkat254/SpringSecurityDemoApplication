package com.koolkat254.springSecurityDemo.controller;

import com.koolkat254.springSecurityDemo.model.Loans;
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

    @GetMapping("/myLoans")
    public List<Loans> getLoanDetails(@RequestParam int id) {
        List<Loans> loans = loanRepository.findByCustomerIdOrderByStartDateDesc(id);
        if (loans != null ) {
            return loans;
        }else {
            return null;
        }
    }

}
