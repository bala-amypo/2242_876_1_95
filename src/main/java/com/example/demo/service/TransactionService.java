package com.example.demo.service;

import com.example.demo.model.TransactionLog;
import java.util.List;

public interface TransactionService {

    TransactionLog saveTransaction(TransactionLog transaction);

    List<TransactionLog> getAllTransactions();

    List<TransactionLog> getTransactionsByUserId(Long userId);
}
