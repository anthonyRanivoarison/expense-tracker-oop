package expense;

import java.time.LocalDate;

public class RefundableExpense extends Expense {
    private boolean refunded;

    public RefundableExpense(double amount, String label, LocalDate date) {
        super(amount, label, date);
        this.refunded = false;
    }

    public void refund() {
        this.refunded = true;
    }

    public boolean isRefunded() {
        return refunded;
    }

    @Override
    public String toString() {
        return super.toString() + ", Remboursée: " + refunded;
    }
}
