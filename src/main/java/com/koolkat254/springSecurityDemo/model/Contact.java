package com.koolkat254.springSecurityDemo.model;

import lombok.Data;

import jakarta.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "contact_messages")
public class Contact {

    @Id
    @Column(name = "contact_id", length = 50)
    private String contactId;

    @Column(name = "contact_name", nullable = false, length = 50)
    private String contactName;

    @Column(name = "contact_email", nullable = false, length = 100)
    private String contactEmail;

    @Column(name = "subject", nullable = false, length = 500)
    private String subject;

    @Column(name = "message", nullable = false, length = 2000)
    private String message;

    @Column(name = "create_date")
    @Temporal(TemporalType.DATE)
    private Date createDate;
}


