package com.myswiggy.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/restaurants")
    List<RestaurantPojo> getRestaurants() {
        return restaurantService.getRestaurants();
    }

    @PostMapping("/restaurants")
    RestaurantPojo registerRestaurant(@RequestBody RestaurantPojo restaurantPojo) {
        return restaurantService.registerRestaurant(restaurantPojo);
    }
}
