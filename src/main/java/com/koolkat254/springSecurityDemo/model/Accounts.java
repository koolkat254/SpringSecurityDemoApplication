package com.koolkat254.springSecurityDemo.model;

import lombok.Data;

import jakarta.persistence.*;

import java.sql.Date;

@Data
@Entity
@Table(name = "accounts")
public class Accounts {

    @Id
    @Column(name = "account_number")
    private int accountNumber;

    @Column(name = "account_type", nullable = false, length = 100)
    private String accountType;

    @Column(name = "branch_address", nullable = false, length = 200)
    private String branchAddress;

    @Column(name = "create_date")
    @Temporal(TemporalType.DATE)
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id", nullable = false)
    private Customer customer;
}

