package com.koolkat254.springSecurityDemo.repository;

import java.util.List;

import com.koolkat254.springSecurityDemo.model.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loans, Long> {

    List<Loans> findByCustomerIdOrderByStartDateDesc(int customerId);

}
