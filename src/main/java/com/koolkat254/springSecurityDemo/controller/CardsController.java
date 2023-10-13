package com.koolkat254.springSecurityDemo.controller;

import com.koolkat254.springSecurityDemo.model.Cards;
import com.koolkat254.springSecurityDemo.model.Customer;
import com.koolkat254.springSecurityDemo.repository.CardsRepository;
import com.koolkat254.springSecurityDemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {

    @Autowired
    private CardsRepository cardsRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/myCards")
    public List<Cards> getCardDetails(@RequestParam String email) {
        Customer customer = customerRepository.findByEmail(email);
        if (customer != null) {
            List<Cards> cards = cardsRepository.findByCustomerId(customer.getId());
            if (cards != null) {
                return cards;
            }
        }
        return null;
    }

}
