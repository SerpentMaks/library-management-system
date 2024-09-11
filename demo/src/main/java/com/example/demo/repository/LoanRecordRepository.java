package com.example.demo.repository;


import com.example.demo.model.LoanRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRecordRepository extends JpaRepository<LoanRecord, Long> {
    List<LoanRecord> findByUserId(Long userId);
}