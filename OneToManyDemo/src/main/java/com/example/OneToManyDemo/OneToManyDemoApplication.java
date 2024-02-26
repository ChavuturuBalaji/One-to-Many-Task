package com.example.OneToManyDemo;

import com.example.OneToManyDemo.Entity.ItemsEntity;
import com.example.OneToManyDemo.Entity.RestaurantEntity;
import com.example.OneToManyDemo.Model.ItemsModel;
import com.example.OneToManyDemo.Model.RestaurantModel;
import com.example.OneToManyDemo.Service.Impl.RestaurantSerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class OneToManyDemoApplication{

	public static void main(String[] args) {
		SpringApplication.run(OneToManyDemoApplication.class, args);
	}

//	@Autowired
//	RestaurantSerImpl restaurantSer;
//
//	@Override
//	public void run(String... args) throws Exception {
//		ItemsEntity item1 = new ItemsEntity("Biriyani","Non veg","Indian");
//		ItemsEntity item2 = new ItemsEntity("Falooda","Juice","Indian");
//		ItemsEntity item3 = new ItemsEntity("Black Forest","Desert","Indian");
//		ItemsEntity item4 = new ItemsEntity("Thalia","Veg Meals","Indian");
//
//		RestaurantEntity restaurantEntity = new RestaurantEntity();
//
//		item1.setRestaurantEntity(restaurantEntity);
//		item2.setRestaurantEntity(restaurantEntity);
//		item3.setRestaurantEntity(restaurantEntity);
//		item4.setRestaurantEntity(restaurantEntity);
//
//		List<ItemsEntity> items = Arrays.asList(item1,item2,item3,item4);
//
//		restaurantEntity.setName("Kinnera");
//		restaurantEntity.setType("Non-Veg");
//		restaurantEntity.setLocation("Nellore");
//		restaurantEntity.setItems(items);
//
//		restaurantSer.add(restaurantEntity);
//
//	}
}
