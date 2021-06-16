package co.com.julianr0223.ExpensesTraker.UseCases;

import co.com.julianr0223.ExpensesTraker.Entities.Expense;
import co.com.julianr0223.ExpensesTraker.Repositories.ExpensiveService;
import org.springframework.stereotype.Service;

@Service
public class CreateExpensiveUseCase {

    private final ExpensiveService expensiveService;

    public CreateExpensiveUseCase(ExpensiveService expensiveService) {
        this.expensiveService = expensiveService;
    }

    public Expense create(Expense expense) {
        return expensiveService.save(expense);
    }
}
