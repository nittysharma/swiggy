package com.myswiggy.invoice;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class InvoiceMaster {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int invoiceNo;
    private Date addDate;
    private String customerId;
    private double amount;
    private String status;
    private int orderId;
}
