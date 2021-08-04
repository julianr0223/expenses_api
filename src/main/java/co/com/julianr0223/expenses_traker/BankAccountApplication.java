package co.com.julianr0223.expenses_traker;

import co.com.julianr0223.expenses_traker.entities.Expense;
import co.com.julianr0223.expenses_traker.repositories.ExpensiveRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class BankAccountApplication {

	private static final Logger log = LoggerFactory.getLogger(BankAccountApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BankAccountApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ExpensiveRepository expensiveRepository) {
		return args -> {
			log.info("-------------- Creating expenses -------------");
			List<Expense> expenses = Arrays.asList(
					new Expense("Expense 1", 100d),
					new Expense("Expense 2", 150d),
					new Expense("Expense 3", 300d),
					new Expense("Expense 4", 230d)
					);
			expensiveRepository.saveAll(expenses);

			log.info("---------------- Get all ----------------------");
			expensiveRepository.findAll().forEach(expense -> log.info(expense.toString()));
		};
	}

}
