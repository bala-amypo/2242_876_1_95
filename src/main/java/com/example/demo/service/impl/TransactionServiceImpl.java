package com.example.demo.service.impl;

import com.example.demo.model.TransactionLog;
import com.example.demo.model.User;
import com.example.demo.repository.TransactionLogRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.TransactionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionLogRepository transactionLogRepository;
    private final UserRepository userRepository;

    public TransactionServiceImpl(TransactionLogRepository transactionLogRepository,
                                  UserRepository userRepository) {
        this.transactionLogRepository = transactionLogRepository;
        this.userRepository = userRepository;
    }

    @Override
    public TransactionLog saveTransaction(TransactionLog transaction) {
        return transactionLogRepository.save(transaction);
    }

    @Override
    public List<TransactionLog> getAllTransactions() {
        return transactionLogRepository.findAll();
    }

    @Override
    public List<TransactionLog> getTransactionsByUserId(Long userId) {
        User user = userRepository.findById(userId).orElse(null);
        return user == null ? List.of() : transactionLogRepository.findByUser(user);
    }
}
