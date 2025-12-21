package com.example.demo.controller;

import com.example.demo.model.BudgetSummary;
import com.example.demo.service.BudgetSummaryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/budget-summaries")
public class BudgetSummaryController {

    private final BudgetSummaryService budgetSummaryService;

    public BudgetSummaryController(BudgetSummaryService budgetSummaryService) {
        this.budgetSummaryService = budgetSummaryService;
    }

    @PostMapping
    public BudgetSummary createBudgetSummary(@RequestBody BudgetSummary budgetSummary) {
        return budgetSummaryService.saveBudgetSummary(budgetSummary);
    }

    @GetMapping("/{id}")
    public BudgetSummary getBudgetSummary(@PathVariable Long id) {
        return budgetSummaryService.getBudgetSummaryById(id);
    }
}
