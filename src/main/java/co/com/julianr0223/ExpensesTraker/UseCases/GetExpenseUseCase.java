package co.com.julianr0223.ExpensesTraker.UseCases;

import co.com.julianr0223.ExpensesTraker.Entities.Expense;
import co.com.julianr0223.ExpensesTraker.Repositories.ExpensiveService;
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
