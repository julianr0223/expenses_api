package co.com.julianr0223.ExpensesTraker.controllers;

import co.com.julianr0223.ExpensesTraker.Entities.Expense;
import co.com.julianr0223.ExpensesTraker.Repositories.ExpensiveRepository;
import co.com.julianr0223.ExpensesTraker.UseCases.CreateExpensiveUseCase;
import co.com.julianr0223.ExpensesTraker.UseCases.GetExpenseUseCase;
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
