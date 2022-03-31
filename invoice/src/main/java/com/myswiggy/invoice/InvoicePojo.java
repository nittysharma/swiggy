package com.myswiggy.invoice;

import lombok.Data;

import java.util.Date;
@Data
public class InvoicePojo {
        private int invoiceNo;
        private Date addDate;
        private String customerId;
        private double amount;
        private String status;
        private int orderId;
    }
