package co.com.julianr0223.ExpensesTraker.Entities;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="tbl_expenses")
public class Expense implements Serializable {

    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String detail;
    private Double amount;

    @Column(name="create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    public Expense() {
    }

    public Expense(String detail, Double amount) {
        this.detail = detail;
        this.amount = amount;
//        this.createDate = LocalDateTime.now();
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
}
