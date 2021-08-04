package co.com.julianr0223.expenses_traker.use_cases;

import co.com.julianr0223.expenses_traker.entities.Expense;
import co.com.julianr0223.expenses_traker.repositories.ExpensiveService;
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
