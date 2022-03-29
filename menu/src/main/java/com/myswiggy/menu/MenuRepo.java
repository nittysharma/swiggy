package com.myswiggy.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface MenuRepo extends JpaRepository<Menu, UUID> {
    List<Menu> findByRestaurantId(String restaurantId);
}
