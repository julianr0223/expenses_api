package co.com.julianr0223.expenses_traker.DataBuilders;

import co.com.julianr0223.expenses_traker.entities.Expense;

import java.util.Arrays;
import java.util.List;

public class ExpenseDataBuilder {

    private Long id;
    private String detail;
    private Double amount;

    public ExpenseDataBuilder() {
        this.id = 1L;
        this.detail = "Expense 1";
        this.amount = 100d;
    }

    public Expense build() {
        Expense expense = new Expense(this.detail, this.amount);
        expense.setId(this.id);
        return expense;
    }

    public List<Expense> buildArray() {
        return Arrays.asList(
                new Expense(this.detail, this.amount),
                new Expense(this.detail, this.amount)
        );
    }
}
