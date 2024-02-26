package com.example.OneToManyDemo.Controller;

import com.example.OneToManyDemo.Entity.ItemsEntity;
import com.example.OneToManyDemo.Entity.RestaurantEntity;
import com.example.OneToManyDemo.Model.ItemsModel;
import com.example.OneToManyDemo.Model.RestaurantModel;
import com.example.OneToManyDemo.Service.Impl.RestaurantSerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RestaurantController {

    @Autowired
    RestaurantSerImpl restaurantSer;


    public int restaurantId;

    @RequestMapping("/")
    public String home(){
        return "home";
    }




    @RequestMapping("/add")
    public String add(ModelMap model){
        RestaurantModel restaurantModel = new RestaurantModel();
        model.put("restaurantModel",restaurantModel);
        return "add";
    }

    @PostMapping ("/store")
    public String addRestaurant(@ModelAttribute("restaurantModel") RestaurantModel restaurantModel){
        return restaurantSer.add(restaurantModel);
    }

    @RequestMapping("/selectRestaurant")
    public String selctRestaurant( ModelMap model){
        List<RestaurantEntity> restaurants = restaurantSer.allRestaurants();
        model.put("restaurants",restaurants);
        return "selectRestaurant";
    }

    @RequestMapping("/addItems")
    public String addItems(ModelMap model){
        ItemsModel itemModel = new ItemsModel();
        model.put("itemModel",itemModel);
        return "addItems";
    }


    @RequestMapping("/addToList")
    public String addToList(@ModelAttribute("itemsModel") ItemsModel itemsModel){
        return restaurantSer.addItem(itemsModel);
    }

    @GetMapping("/DeleteRestaurant")
    public String deleteRestaurant(@RequestParam("restaurantId") int id){
        restaurantSer.deleteRestaurant(id);
        return "redirect:/selectRestaurant";
    }

    @GetMapping("/DeleteItem")
    public String deleteItems(@RequestParam("restaurantId") int id,ModelMap model){
        List<ItemsEntity> items = restaurantSer.viewItems(id);
        model.put("items",items);
        restaurantId = id;
        return "items";
    }

    @GetMapping("/deleteSingleItem")
    public String deleteSingleItem(@RequestParam("itemID") int id){
        restaurantSer.deleteSingleItem(id);
        return "redirect:/DeleteItem?restaurantId=" + restaurantId;

    }

    @RequestMapping("/updateItems")
    public String updateItems(@RequestParam("itemID") int id,ModelMap model){
        ItemsModel itemsModel = restaurantSer.getItem(id);
        model.put("itemsModel",itemsModel);
        return "updateItem";
    }

    @PostMapping("/updatedItem")
    public String updatedItem(@RequestParam("itemID") int id,@ModelAttribute("itemsModel") ItemsModel itemsModel){
        restaurantSer.updateItem(id,itemsModel);
        return "redirect:/DeleteItem?restaurantId=" + restaurantId;
    }
}
