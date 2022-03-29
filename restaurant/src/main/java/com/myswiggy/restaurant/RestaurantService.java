package com.myswiggy.restaurant;

import java.util.List;

public interface RestaurantService {
    List<RestaurantPojo> getRestaurants();

    RestaurantPojo registerRestaurant(RestaurantPojo restaurantPojo);
}
