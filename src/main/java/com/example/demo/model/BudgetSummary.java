import jakarta.persistence.*;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "budget_summaries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BudgetSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "budget_plan_id", nullable = false, unique = true)
    private BudgetPlan budgetPlan;

    @PositiveOrZero
    @Column(nullable = false)
    private Double totalIncome;

    @PositiveOrZero
    @Column(nullable = false)
    private Double totalExpense;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BudgetStatus status;

    @Column(nullable = false, updatable = false)
    private LocalDateTime generatedAt;
  public enum BudgetStatus {
        UNDER_LIMIT,
        OVER_LIMIT
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BudgetStatus status;

    @PrePersist
    @PreUpdate
    private void calculateStatus() {
        if (totalExpense > budgetPlan.getExpenseLimit()) {
            this.status = BudgetStatus.OVER_LIMIT;
        } else {
            this.status = BudgetStatus.UNDER_LIMIT;
        }
    }

    @PrePersist
    private void onCreate() {
        this.generatedAt = LocalDateTime.now();
    }
}
