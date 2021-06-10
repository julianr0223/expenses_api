package co.com.julianr0223.BankAccount.UseCases;

import co.com.julianr0223.BankAccount.DataBuilders.ExpenseDataBuilder;
import co.com.julianr0223.BankAccount.Entities.Expense;
import co.com.julianr0223.BankAccount.Repositories.ExpensiveRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateAccountTest {
    private CreateExpensiveUseCase createExpenseUseCase;
    private ExpensiveRepository expensiveRepository;

    @BeforeEach
    public void initUseCase() {
        System.out.println("Runs before all");
        this.expensiveRepository = Mockito.mock(ExpensiveRepository.class);
        this.createExpenseUseCase = new CreateExpensiveUseCase(expensiveRepository);
    }

    @Test
    public void insertExpenseIsOk() {
        Expense newExpense = new Expense("Ex1", 200000d);
        Mockito.when(this.expensiveRepository.save(newExpense)).thenReturn(new ExpenseDataBuilder().build());
        Expense expenseSeved = createExpenseUseCase.create(newExpense);
        assertNotNull(expenseSeved.getId());
    }

}
