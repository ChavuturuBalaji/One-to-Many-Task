package com.example.OneToManyDemo.Model;

import com.example.OneToManyDemo.Entity.RestaurantEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ItemsModel {
    private int itemID;
    private String name;
    private String category;
    private String cuisine;
    private RestaurantEntity restaurantEntity;

    public ItemsModel(String name, String category, String cuisine) {
        this.name = name;
        this.category = category;
        this.cuisine = cuisine;
    }
}
