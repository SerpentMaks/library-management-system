package com.example.demo.service;


import com.example.demo.model.LoanRecord;
import com.example.demo.repository.LoanRecordRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LoanRecordService {

    private final LoanRecordRepository loanRecordRepository;

    public LoanRecordService(LoanRecordRepository loanRecordRepository) {
        this.loanRecordRepository = loanRecordRepository;
    }

    public LoanRecord createLoanRecord(Long userId, Long bookId) {
        LoanRecord record = new LoanRecord();
        record.setLoanDate(LocalDate.now());
        // Здесь нужно получить и установить пользователя и книгу через репозиторий
        return loanRecordRepository.save(record);
    }

    public List<LoanRecord> getLoanRecordsByUser(Long userId) {
        return loanRecordRepository.findByUserId(userId);
    }
}