package co.com.julianr0223.expenses_traker.dto;


import java.util.Date;

public class ExpenseDTO  {
    private Long id;

    private String detail;
    private Double amount;
    private Date createDate;

    public ExpenseDTO(String detail, Double amount) {
        this.detail = detail;
        this.amount = amount;
        this.createDate = new Date();
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

    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                ", amount=" + amount +
                ", createDate=" + createDate +
                '}';
    }
}
