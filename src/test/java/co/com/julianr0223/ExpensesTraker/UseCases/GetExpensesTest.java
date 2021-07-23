package co.com.julianr0223.ExpensesTraker.UseCases;

import co.com.julianr0223.ExpensesTraker.DataBuilders.ExpenseDataBuilder;
import co.com.julianr0223.ExpensesTraker.Entities.Expense;
import co.com.julianr0223.ExpensesTraker.Repositories.ExpensiveService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

class GetExpensesTest {

    private GetExpenseUseCase getExpenseUseCase;
    private ExpensiveService expensiveService;

    @BeforeEach
    public void inituseCase() {
        this.expensiveService = Mockito.mock(ExpensiveService.class);
        getExpenseUseCase = new GetExpenseUseCase(this.expensiveService);
    }

    @Test
    void getExpensesWhenThereAreExpenses() {
        List<Expense> actual = new ExpenseDataBuilder().buildArray();
        Mockito.when(this.expensiveService.get()).thenReturn(actual);
        List<Expense> expectedExpenses = getExpenseUseCase.getExpenses();
        Assertions.assertEquals(expectedExpenses, actual);
    }
}
