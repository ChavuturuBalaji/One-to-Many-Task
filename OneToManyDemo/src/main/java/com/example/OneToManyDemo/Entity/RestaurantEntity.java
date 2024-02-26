package com.example.OneToManyDemo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;


import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int restaurantID;
    private String name;
    private String type;
    private String location;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurantEntity")
    private List<ItemsEntity> items;

    public RestaurantEntity(String name, String type, String location, List<ItemsEntity> items) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.items = items;
    }
}
