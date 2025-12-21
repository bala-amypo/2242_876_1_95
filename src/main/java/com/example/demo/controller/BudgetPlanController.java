package com.example.demo.controller;

import com.example.demo.model.BudgetPlan;
import com.example.demo.service.BudgetPlanService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/budget-plans")
public class BudgetPlanController {

    private final BudgetPlanService budgetPlanService;

    public BudgetPlanController(BudgetPlanService budgetPlanService) {
        this.budgetPlanService = budgetPlanService;
    }

    @PostMapping
    public BudgetPlan createBudgetPlan(@RequestBody BudgetPlan budgetPlan) {
        return budgetPlanService.saveBudgetPlan(budgetPlan);
    }

    @GetMapping("/{id}")
    public BudgetPlan getBudgetPlan(@PathVariable Long id) {
        return budgetPlanService.getBudgetPlanById(id);
    }
}
