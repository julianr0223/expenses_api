package co.com.julianr0223.expenses_traker.repositories;

import co.com.julianr0223.expenses_traker.entities.Expense;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class ExpensiveService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Expense save(Expense expense) {
        entityManager.persist(expense);
        return expense;
    }

    @Transactional(readOnly = true)
    public List<Expense> get() {
        return entityManager.createQuery("from Expense").getResultList();
    }
}
