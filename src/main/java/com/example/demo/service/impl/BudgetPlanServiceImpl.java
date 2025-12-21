package com.example.demo.service.impl;

import com.example.demo.model.BudgetPlan;
import com.example.demo.repository.BudgetPlanRepository;
import com.example.demo.service.BudgetPlanService;
import org.springframework.stereotype.Service;

@Service
public class BudgetPlanServiceImpl implements BudgetPlanService {

    private final BudgetPlanRepository budgetPlanRepository;

    public BudgetPlanServiceImpl(BudgetPlanRepository budgetPlanRepository) {
        this.budgetPlanRepository = budgetPlanRepository;
    }

    @Override
    public BudgetPlan saveBudgetPlan(BudgetPlan budgetPlan) {
        return budgetPlanRepository.save(budgetPlan);
    }

    @Override
    public BudgetPlan getBudgetPlanById(Long id) {
        return budgetPlanRepository.findById(id).orElse(null);
    }
}
