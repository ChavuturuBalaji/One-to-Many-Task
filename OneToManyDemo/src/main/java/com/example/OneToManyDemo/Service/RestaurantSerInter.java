package com.example.OneToManyDemo.Service;

import com.example.OneToManyDemo.Entity.ItemsEntity;
import com.example.OneToManyDemo.Entity.RestaurantEntity;
import com.example.OneToManyDemo.Model.ItemsModel;
import com.example.OneToManyDemo.Model.RestaurantModel;

import java.util.List;

public interface RestaurantSerInter {
    public String add(RestaurantModel restaurantModel);
    public List<RestaurantEntity> allRestaurants();
    public String  addItem(ItemsModel itemsModel);

    public void deleteRestaurant(int id);
    public List<ItemsEntity> viewItems(int id);
    public void deleteSingleItem(int id);
    public ItemsModel getItem(int id);
    public void updateItem(int id,ItemsModel itemsModel);
}
