package co.com.julianr0223.ExpensesTraker.UseCases;

import co.com.julianr0223.ExpensesTraker.DataBuilders.ExpenseDataBuilder;
import co.com.julianr0223.ExpensesTraker.Entities.Expense;
import co.com.julianr0223.ExpensesTraker.Repositories.ExpensiveService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateExpenseTest {
    private ExpensiveService expensiveService;
    private CreateExpensiveUseCase createExpenseUseCase;

    @BeforeEach
    public void initUseCase() {
        System.out.println("Runs before all");
        this.expensiveService = Mockito.mock(ExpensiveService.class);
        this.createExpenseUseCase = new CreateExpensiveUseCase(expensiveService);
    }

    @Test
    public void insertExpenseIsOk() {
        Expense newExpense = new Expense("Ex1", 200000d);
        Mockito.when(this.expensiveService.save(newExpense)).thenReturn(new ExpenseDataBuilder().build());
        Expense expenseSeved = createExpenseUseCase.create(newExpense);
        assertNotNull(expenseSeved.getId());
    }

}
