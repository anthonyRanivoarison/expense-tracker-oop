package expense;

import java.time.LocalDate;

public class expense {
    private String label;
    private double amount;
    private LocalDate date;

    public expense(double amount, String label, LocalDate date) {
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

    boolean isLargeExpense(double amount) {
        if (amount > 100.0) {
            return true;
        }
        return false;
    }

    public String toString(){
        return "Depense: "+label+" prix"+amount+" le:"+date;
    }

}

