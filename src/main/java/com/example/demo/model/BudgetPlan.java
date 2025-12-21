package com.example.demo.model;

import com.example.demo.exception.BadRequestException;
import jakarta.persistence.*;

@Entity
@Table(name = "budget_plans")
public class BudgetPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(optional = false)
    private User user;

    @Column(name = "budget_month", nullable = false)
    private Integer month;

    @Column(name = "budget_year", nullable = false)
    private Integer year;

    @Column(nullable = false)
    private Double incomeTarget;

    @Column(nullable = false)
    private Double expenseLimit;

    public BudgetPlan() {}

    public BudgetPlan(int id, User user, Integer month, Integer year, Double incomeTarget, Double expenseLimit) {
        this.id = id;
        this.user = user;
        this.month = month;
        this.year = year;
        this.incomeTarget = incomeTarget;
        this.expenseLimit = expenseLimit;
    }

    public void validate() {
        if (month == null || month < 1 || month > 12) {
            throw new BadRequestException("Month must be between 1 and 12");
        }
        if (incomeTarget == null || incomeTarget < 0) {
            throw new BadRequestException("Income target must be >= 0");
        }
        if (expenseLimit == null || expenseLimit < 0) {
            throw new BadRequestException("Expense limit must be >= 0");
        }
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public Integer getMonth() { return month; }
    public void setMonth(Integer month) { this.month = month; }
    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }
    public Double getIncomeTarget() { return incomeTarget; }
    public void setIncomeTarget(Double incomeTarget) { this.incomeTarget = incomeTarget; }
    public Double getExpenseLimit() { return expenseLimit; }
    public void setExpenseLimit(Double expenseLimit) { this.expenseLimit = expenseLimit; }
}
