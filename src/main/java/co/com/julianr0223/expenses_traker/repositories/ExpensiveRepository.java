package co.com.julianr0223.expenses_traker.repositories;

import co.com.julianr0223.expenses_traker.entities.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensiveRepository extends JpaRepository<Expense, Long> {
}
