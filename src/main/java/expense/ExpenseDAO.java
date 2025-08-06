package expense;

import java.util.List;
import java.util.stream.Collectors;

public class ExpenseDAO {
    private List<Expense> expenses;

    public ExpenseDAO(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public List<RefundableExpense> getUnrefundedExpenses() {
        return expenses
                .stream()
                .filter(e -> e instanceof RefundableExpense)
                .map(e -> (RefundableExpense) e)
                .filter(e -> e.isRefunded() == false)
                .collect(Collectors.toList());
    }

    public double getTotalRecurringAmount() {
        return expenses
                .stream()
                .filter(e -> e instanceof  RecurringExpenses)
                .map(e -> ((RecurringExpenses) e).getAmount())
                .reduce(0.0, (a, b) -> a + b);
    }


    public List<String> getLabelsOfLargeExpenses() {
        return expenses
                .stream()
                .filter(e -> e.getAmount() > 100)
                .map(e -> e.getLabel())
                .collect(Collectors.toList());
    }


    public Double getTotalAmount() {
        return expenses
                .stream()
                .map(e -> e.getAmount())
                .reduce(0.0, (a, b) -> a + b);
    }
}
