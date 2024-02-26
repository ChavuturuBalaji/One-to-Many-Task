package com.example.OneToManyDemo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ItemsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemID;
    private String name;
    private String category;
    private String cuisine;
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private RestaurantEntity restaurantEntity;

    public ItemsEntity(String name, String category, String cuisine, RestaurantEntity restaurantEntity) {
        this.name = name;
        this.category = category;
        this.cuisine = cuisine;
        this.restaurantEntity = restaurantEntity;
    }
}
