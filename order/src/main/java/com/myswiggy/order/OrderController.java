package com.myswiggy.order;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class OrderController {
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    OrderService orderService;
    @GetMapping("/orders")
    List<OrderPojo> getAllOrders(){
        return this.orderService.getAllOrders().stream().map(this::convertToPojo).collect(Collectors.toList());
    }

    OrderPojo convertToPojo(SwiggyOrder order){
        return modelMapper.map(order,OrderPojo.class);
    }

    SwiggyOrder convertToPojo(OrderPojo orderPojo){
        return modelMapper.map(orderPojo,SwiggyOrder.class);
    }
}
