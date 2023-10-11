package com.koolkat254.springSecurityDemo.repository;

import java.util.List;

import com.koolkat254.springSecurityDemo.model.AccountTransactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTransactionsRepository extends JpaRepository<AccountTransactions, Long> {

    List<AccountTransactions> findByCustomerIdOrderByTransactionDateDesc(int customerId);

}
