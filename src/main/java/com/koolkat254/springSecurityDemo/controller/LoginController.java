package com.koolkat254.springSecurityDemo.controller;

import com.koolkat254.springSecurityDemo.model.Customer;
import com.koolkat254.springSecurityDemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.Authentication;

import java.sql.Date;

@RestController
public class LoginController {

    @Autowired
    private CustomerRepository customerRepository;


    @RequestMapping("/user")
    public Customer getUserDetailsAfterLogin(Authentication authentication) {
        Customer customer = customerRepository.findByEmail(authentication.getName());
        return customer;

    }

}
