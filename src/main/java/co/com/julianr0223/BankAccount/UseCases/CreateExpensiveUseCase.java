package co.com.julianr0223.BankAccount.UseCases;

import co.com.julianr0223.BankAccount.Entities.Expense;
import co.com.julianr0223.BankAccount.Repositories.ExpensiveRepository;

public class CreateExpensiveUseCase {

    private ExpensiveRepository expensiveRepository;

    public CreateExpensiveUseCase(ExpensiveRepository expensiveRepository) {
        this.expensiveRepository = expensiveRepository;
    }

    public Expense create(Expense expense) {
        return expensiveRepository.save(expense);
    }
}
