package com.myswiggy.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepo orderRepo;
    @Override
    public List<SwiggyOrder> getAllOrders() {
        return orderRepo.findAll();
    }
}
