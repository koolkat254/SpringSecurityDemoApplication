package com.koolkat254.springSecurityDemo.repository;

import com.koolkat254.springSecurityDemo.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {


}
