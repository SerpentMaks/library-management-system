package com.example.demo.controller;


import com.example.demo.model.LoanRecord;
import com.example.demo.service.LoanRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanRecordController {

    private final LoanRecordService loanRecordService;

    public LoanRecordController(LoanRecordService loanRecordService) {
        this.loanRecordService = loanRecordService;
    }

    @PostMapping("/{userId}/{bookId}")
    public LoanRecord createLoanRecord(@PathVariable Long userId, @PathVariable Long bookId) {
        return loanRecordService.createLoanRecord(userId, bookId);
    }

    @GetMapping("/user/{userId}")
    public List<LoanRecord> getLoanRecordsByUser(@PathVariable Long userId) {
        return loanRecordService.getLoanRecordsByUser(userId);
    }
}