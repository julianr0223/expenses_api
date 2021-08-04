package co.com.julianr0223.expenses_traker.use_cases;

import co.com.julianr0223.expenses_traker.DataBuilders.ExpenseDataBuilder;
import co.com.julianr0223.expenses_traker.entities.Expense;
import co.com.julianr0223.expenses_traker.repositories.ExpensiveService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CreateExpenseTest {
    private ExpensiveService expensiveService;
    private CreateExpensiveUseCase createExpenseUseCase;

    @BeforeEach
    public void initUseCase() {
        System.out.println("Runs before all");
        this.expensiveService = Mockito.mock(ExpensiveService.class);
        this.createExpenseUseCase = new CreateExpensiveUseCase(expensiveService);
    }

    @Test
    void insertExpenseIsOk() {
        Expense newExpense = new Expense("Ex1", 200000d);
        Mockito.when(this.expensiveService.save(newExpense)).thenReturn(new ExpenseDataBuilder().build());
        Expense expenseSeved = createExpenseUseCase.create(newExpense);
        assertNotNull(expenseSeved.getId());
    }

}
