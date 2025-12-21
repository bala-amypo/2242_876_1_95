package com.example.demo.controller;

import com.example.demo.model.TransactionLog;
import com.example.demo.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public TransactionLog createTransaction(@RequestBody TransactionLog transaction) {
        return transactionService.saveTransaction(transaction);
    }

    @GetMapping
    public List<TransactionLog> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/user/{userId}")
    public List<TransactionLog> getTransactionsByUserId(@PathVariable Long userId) {
        return transactionService.getTransactionsByUserId(userId);
    }
}
