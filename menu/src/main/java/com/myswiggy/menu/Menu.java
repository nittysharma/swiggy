package com.myswiggy.menu;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;
    @NotNull
    private String restaurantId;
    @NotNull
    private String dishName;
    private String dishDesc;
    @NotNull
    private double price;
    @NotNull
    private double quantity;
    private String startTime;
    private String endTime;
    private String days;
    private String imageUrl;
}
