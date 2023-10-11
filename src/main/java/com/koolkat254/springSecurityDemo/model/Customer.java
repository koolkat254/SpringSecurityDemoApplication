package com.koolkat254.springSecurityDemo.model;

import lombok.Data;

import jakarta.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int Id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "mobile_number", nullable = false, length = 20)
    private String mobileNumber;

    @Column(name = "password", nullable = false, length = 500)
    private String password;

    @Column(name = "role", nullable = false, length = 100)
    private String role;

    @Column(name = "create_date")
    @Temporal(TemporalType.DATE)
    private Date createDate;
}

