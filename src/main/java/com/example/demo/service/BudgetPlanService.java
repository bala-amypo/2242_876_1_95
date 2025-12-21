package com.example.demo.service;

import com.example.demo.model.BudgetPlan;

public interface BudgetPlanService {

    BudgetPlan saveBudgetPlan(BudgetPlan budgetPlan);

    BudgetPlan getBudgetPlanById(Long id);
}
