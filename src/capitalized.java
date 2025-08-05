import java.time.LocalDate;

public class capitalized {
    private String label;
    private double amount;
    private LocalDate date;

    public capitalized(double amount, String label, LocalDate date) {
        this.amount = amount;
        this.label = label;
        this.date = date;
    }

    public String getLabel() {
        return label;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isLargeExpense(double amount) {
        if (amount > 100.0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
    return "Expense: "+label+" price"+amount+" on:"+date;
    }

}
