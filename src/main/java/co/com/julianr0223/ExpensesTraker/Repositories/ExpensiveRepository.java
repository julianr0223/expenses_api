package co.com.julianr0223.ExpensesTraker.Repositories;

import co.com.julianr0223.ExpensesTraker.Entities.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensiveRepository extends JpaRepository<Expense, Long> {

}
