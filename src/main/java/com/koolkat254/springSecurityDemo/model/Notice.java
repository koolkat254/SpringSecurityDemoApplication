package com.koolkat254.springSecurityDemo.model;

import lombok.Data;

import jakarta.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "notice_details")
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_id")
    private int noticeId;

    @Column(name = "notice_summary", nullable = false, length = 200)
    private String noticeSummary;

    @Column(name = "notice_details", nullable = false, length = 500)
    private String noticeDetails;

    @Column(name = "notice_begin_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date noticeBeginDate;

    @Column(name = "notice_end_date")
    @Temporal(TemporalType.DATE)
    private Date noticeEndDate;

    @Column(name = "create_date")
    @Temporal(TemporalType.DATE)
    private Date createDate;

    @Column(name = "update_date")
    @Temporal(TemporalType.DATE)
    private Date updateDate;
}


