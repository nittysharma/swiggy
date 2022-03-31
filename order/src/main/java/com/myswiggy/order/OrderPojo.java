package com.myswiggy.order;

import lombok.Data;

import java.util.Date;

@Data
public class OrderPojo {
    private int orderId;
    private String customerId;
    private String status;
    private Date addDate;
    private Date updatedOn;
    private String restaurantId;
}
