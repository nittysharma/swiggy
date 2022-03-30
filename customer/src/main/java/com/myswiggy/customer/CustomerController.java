package com.myswiggy.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/customers")
    List<CustomerPojo> getCustomers(){
        return customerService.getCustomers();
    }
}
