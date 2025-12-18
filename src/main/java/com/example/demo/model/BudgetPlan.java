import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(
    name = "budget_plans",
    uniqueConstraints = {
        @UniqueConstraint(
            columnNames = {"user_id", "month", "year"}
        )
    }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BudgetPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Min(value = 1, message = "Month must be between 1 and 12")
    @Max(value = 12, message = "Month must be between 1 and 12")
    @Column(nullable = false)
    private Integer month;

    @Min(value = 2000) // optional but recommended
    @Column(nullable = false)
    private Integer year;

    @PositiveOrZero(message = "Income target must be ≥ 0")
    @Column(nullable = false)
    private Double incomeTarget;

    @PositiveOrZero(message = "Expense limit must be ≥ 0")
    @Column(nullable = false)
    private Double expenseLimit;
}
