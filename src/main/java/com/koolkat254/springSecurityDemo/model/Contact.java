package com.koolkat254.springSecurityDemo.model;

import jakarta.persistence.*;
import java.sql.Date;

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

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}


