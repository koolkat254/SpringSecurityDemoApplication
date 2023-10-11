package com.koolkat254.springSecurityDemo.model;

import lombok.Data;

import jakarta.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "account_transactions")
public class AccountTransactions {

    @Id
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "transaction_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date transactionDate;

    @Column(name = "transaction_summary", nullable = false, length = 200)
    private String transactionSummary;

    @Column(name = "transaction_type", nullable = false, length = 100)
    private String transactionType;

    @Column(name = "transaction_amount", nullable = false)
    private int transactionAmount;

    @Column(name = "closing_balance", nullable = false)
    private int closingBalance;

    @Column(name = "create_date")
    @Temporal(TemporalType.DATE)
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "account_number", referencedColumnName = "account_number", nullable = false)
    private Accounts account;
}


