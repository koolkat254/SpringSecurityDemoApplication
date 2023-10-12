package com.koolkat254.springSecurityDemo.model;

import jakarta.persistence.*;

import java.sql.Date;

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

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
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
}

