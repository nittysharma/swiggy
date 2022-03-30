package com.myswiggy.customer;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class SwiggyCustomer {
    @Id
    private String userId;
    private String emailId;
    private long mobileNo;
    private String address;
    private String password;
    private int otp;
}
