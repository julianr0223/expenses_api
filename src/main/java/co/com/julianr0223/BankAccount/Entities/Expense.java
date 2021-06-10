package co.com.julianr0223.BankAccount.Entities;


import java.time.LocalDateTime;

public class Expense {

    private Long id;
    private String detail;
    private Double amount;
    private LocalDateTime date;

    public Expense() {
    }

    public Expense(String detail, Double amount) {
        this.detail = detail;
        this.amount = amount;
        this.date = LocalDateTime.now();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getDetail() {
        return detail;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
