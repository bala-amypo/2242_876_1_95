package com.example.demo.model;
.*;



@Entity

@Table(name = "budget_plans")

public class BudgetPlan {



    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;



    @ManyToOne

    @JoinColumn(name = "user_id")

    private User user;



    private Integer month;

    private Integer year;

    private Double incomeTarget;

    private Double expenseLimit;



    @OneToOne(mappedBy = "budgetPlan")

    private BudgetSummary summary;



    // No-arg constructor

    public BudgetPlan() {

        }



        // Parameterized constructor (order required by tests)

        public BudgetPlan(Long id,
        )
        User user,

        Integer month,

        Integer year,

        Double incomeTarget,

        Double expenseLimit) {

            this.id = id;

            this.user = user;

            this.month = month;

            this.year = year;

            this.incomeTarget = incomeTarget;

            this.expenseLimit = expenseLimit;

            }



            // Business validation

            public void validate() {

                if (month == null || month < 1 || month > 12) {
            
            hroimport React from 'react';

export default function Course() {
  return <div>Course Component</div>;
}
import React from 'react';

export default function Profile() {
  return <div>User Profile</div>;
}
import React from 'react';

export default function Quizzes() {
  return <div>Quizzes Component</div>;
}
import React from 'react';

export default function Assignments() {
  return <div>Assignments Component</div>;
}
import React from 'react';

export default function Discussions() {
  return <div>Discussions Component</div>;
}
w new BadRequestException("Invalid month");

}

if (incomeTarget == null || incomeTarget < 0) {

throw new BadRequestException("Income target must be >= 0");

}

if (expenseLimit == null || expenseLimit < 0) {

throw new BadRequestException("Expense limit must be >= 0");

}

}



// ----------- Getters & Setters -----------



public Long getId() {

return id;

}



public void setId(Long id) {

this.id = id;

}



public User getUser() {

return user;

}



public void setUser(User user) {

this.user = user;

}



public Integer getMonth() {

return month;

}



public void setMonth(Integer month) {

this.month = month;

}



public Integer getYear() {

return year;

}



public void setYear(Integer year) {

this.year = year;

}



public Double getIncomeTarget() {

return incomeTarget;

}



public void setIncomeTarget(Double incomeTarget) {

this.incomeTarget = incomeTarget;

}



public Double getExpenseLimit() {

return expenseLimit;

}



public void setExpenseLimit(Double expenseLimit) {

this.expenseLimit = expenseLimit;

}



public BudgetSummary getSummary() {

return summary;

}



public void setSummary(BudgetSummary summary) {

this.summary = summary;

}

}




            }
        }
    }
}
e

import com.example.demo.exception.BadRequestException;

import jakarta.persistenc