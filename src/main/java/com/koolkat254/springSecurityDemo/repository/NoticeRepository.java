package com.koolkat254.springSecurityDemo.repository;

import java.util.List;

import com.koolkat254.springSecurityDemo.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long> {

    @Query(value = "from Notice n where CURDATE() BETWEEN noticeBeginDate AND noticeEndDate")
    List<Notice> findAllActiveNotices();

}
