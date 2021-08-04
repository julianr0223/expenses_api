package co.com.julianr0223.expenses_traker.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="tbl_expenses")
public class Expense implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String detail;
    private Double amount;

    @Column(name="create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    protected Expense() {
    }

    public Expense(String detail, Double amount) {
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
