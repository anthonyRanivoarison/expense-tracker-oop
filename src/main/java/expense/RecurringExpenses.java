package expense;

import java.time.LocalDate;

public class RecurringExpenses extends Expense {
    private String recurrence;

    public RecurringExpenses(double amount, String label, String recurrence,LocalDate date) {
        super(amount, label, date);

        if ("monthly".equalsIgnoreCase(recurrence) || "yearly".equalsIgnoreCase(recurrence)) {
            this.recurrence = recurrence.toLowerCase();
        } else {
            this.recurrence = "monthly"; // valeur par défaut
        }
    }

    public String getRecurrence() {
        return recurrence;
    }

    @Override
    public String toString() {
        return super.toString() + ", Récurrence: " + recurrence;
    }
}
