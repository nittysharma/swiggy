package com.myswiggy.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class CustomerPojo {
    private String userId;
    private String emailId;
    private long mobileNo;
    private String address;
    @JsonIgnore
    private String password;
    @JsonIgnore
    private int otp;
}
