package co.com.julianr0223.BankAccount.DataBuilders;

import co.com.julianr0223.BankAccount.Entities.Expense;

import java.time.LocalDateTime;

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
}
