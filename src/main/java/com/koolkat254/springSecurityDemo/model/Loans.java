package com.koolkat254.springSecurityDemo.model;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "loans")
public class Loans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_number")
    private int loanNumber;

    @Column(name = "start_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "loan_type", nullable = false, length = 100)
    private String loanType;

    @Column(name = "total_loan", nullable = false)
    private int totalLoan;

    @Column(name = "amount_paid", nullable = false)
    private int amountPaid;

    @Column(name = "outstanding_amount", nullable = false)
    private int outstandingAmount;

    @Column(name = "create_date")
    @Temporal(TemporalType.DATE)
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id", nullable = false)
    private Customer customer;

    public int getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public int getTotalLoan() {
        return totalLoan;
    }

    public void setTotalLoan(int totalLoan) {
        this.totalLoan = totalLoan;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public int getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(int outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
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

