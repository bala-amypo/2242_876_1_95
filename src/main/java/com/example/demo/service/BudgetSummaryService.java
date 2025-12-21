package com.example.demo.service;

import com.example.demo.model.BudgetSummary;

public interface BudgetSummaryService {

    BudgetSummary saveBudgetSummary(BudgetSummary budgetSummary);

    BudgetSummary getBudgetSummaryById(Long id);
}
