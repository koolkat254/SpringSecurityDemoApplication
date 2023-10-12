package com.koolkat254.springSecurityDemo.model;

import jakarta.persistence.*;
import java.sql.Date;

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

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionSummary() {
        return transactionSummary;
    }

    public void setTransactionSummary(String transactionSummary) {
        this.transactionSummary = transactionSummary;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public int getClosingBalance() {
        return closingBalance;
    }

    public void setClosingBalance(int closingBalance) {
        this.closingBalance = closingBalance;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }
}


