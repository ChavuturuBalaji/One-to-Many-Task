package com.example.OneToManyDemo.Service.Impl;

import com.example.OneToManyDemo.Entity.ItemsEntity;
import com.example.OneToManyDemo.Entity.RestaurantEntity;
import com.example.OneToManyDemo.Model.ItemsModel;
import com.example.OneToManyDemo.Model.RestaurantModel;
import com.example.OneToManyDemo.Repository.ItemsRepo;
import com.example.OneToManyDemo.Repository.RestaurantRepo;
import com.example.OneToManyDemo.Service.RestaurantSerInter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RestaurantSerImpl implements RestaurantSerInter {
    @Autowired
    RestaurantRepo restaurantRepo;
    @Autowired
    ItemsRepo itemsRepo;



    @Override
    public String  add(RestaurantModel restaurantModel){

        if(restaurantModel.getName().isBlank() || restaurantModel.getType().isBlank() || restaurantModel.getLocation().isBlank()){
            return "nullValues";
        }
        RestaurantEntity restaurantEntity = new RestaurantEntity();
        BeanUtils.copyProperties(restaurantModel,restaurantEntity);
        restaurantRepo.save(restaurantEntity);
        return "redirect:/selectRestaurant";


    }

    @Override
    public List<RestaurantEntity> allRestaurants() {
        return restaurantRepo.findAll();
    }

    @Override
    public String addItem(ItemsModel itemsModel) {
        if (itemsModel.getRestaurantEntity()== null || itemsModel.getCategory().isBlank() || itemsModel.getName().isBlank() || itemsModel.getCuisine().isBlank()){
            return "nullValues";
        }
        RestaurantEntity restEntity = restaurantRepo.findById(itemsModel.getRestaurantEntity().getRestaurantID()).get();
        ItemsEntity itemsEntity = new ItemsEntity();
        BeanUtils.copyProperties(itemsModel,itemsEntity);
        List<ItemsEntity> items = Arrays.asList(itemsEntity);
        restEntity.setItems(items);
        itemsRepo.save(itemsEntity);
        return "redirect:/selectRestaurant";
    }

    @Override
    public void deleteRestaurant(int id) {
        restaurantRepo.deleteById(id);

    }

    @Override
    public List<ItemsEntity> viewItems(int id) {
        List<ItemsEntity> items = itemsRepo.findAll();
        List<ItemsEntity> itemsFilter = items.stream().filter(i -> i.getRestaurantEntity().getRestaurantID() == id).toList();
        return itemsFilter;
    }

    @Override
    public void deleteSingleItem(int id) {
        itemsRepo.deleteById(id);
    }

    @Override
    public ItemsModel getItem(int id) {
        ItemsEntity itemsEntity = itemsRepo.findById(id).get();
        ItemsModel itemsModel = new ItemsModel();
        BeanUtils.copyProperties(itemsEntity,itemsModel);
        return itemsModel;
    }

    @Override
    public void updateItem(int id,ItemsModel itemsModel) {
        ItemsEntity itemsEntity = itemsRepo.findById(id).get();
        itemsEntity.setName(itemsModel.getName());
        itemsEntity.setCategory(itemsModel.getCategory());
        itemsEntity.setCuisine(itemsModel.getCuisine());
        itemsRepo.save(itemsEntity);
    }
}
