package co.com.julianr0223.expenses_traker.controllers;

import co.com.julianr0223.expenses_traker.entities.Expense;
import co.com.julianr0223.expenses_traker.repositories.ExpensiveRepository;
import co.com.julianr0223.expenses_traker.use_cases.CreateExpensiveUseCase;
import co.com.julianr0223.expenses_traker.use_cases.GetExpenseUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExpensesController {

    @Autowired
    private GetExpenseUseCase getExpenseUseCase;

    @Autowired
    private CreateExpensiveUseCase createExpensiveUseCase;

    @Autowired
    private ExpensiveRepository expensiveRepositiry;

    @GetMapping(value = "/expense", produces = "application/json")
    public List<Expense> getExpenses() {
        return expensiveRepositiry.findAll();
    }

    @PostMapping("/expense")
    public Expense createExpense(@RequestBody Expense expense) {
        return expensiveRepositiry.save(expense);
    }
}
