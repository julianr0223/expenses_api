package co.com.julianr0223.expenses_traker.use_cases;

import co.com.julianr0223.expenses_traker.entities.Expense;
import co.com.julianr0223.expenses_traker.repositories.ExpensiveService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetExpenseUseCase {

    private ExpensiveService expensiveService;

    public GetExpenseUseCase(ExpensiveService expensiveService) {
        this.expensiveService = expensiveService;
    }

    public List<Expense> getExpenses() {
        return this.expensiveService.get();

    }
}
