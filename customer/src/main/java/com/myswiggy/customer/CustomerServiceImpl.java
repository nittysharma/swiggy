package com.myswiggy.customer;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public List<CustomerPojo> getCustomers() {
        return customerRepo.findAll().stream().map(this::convertToPojo).collect(Collectors.toList());
    }

    CustomerPojo convertToPojo(SwiggyCustomer swiggyCustomer){
        CustomerPojo customerPojo=modelMapper.map(swiggyCustomer,CustomerPojo.class);
        return customerPojo;
    }
}
