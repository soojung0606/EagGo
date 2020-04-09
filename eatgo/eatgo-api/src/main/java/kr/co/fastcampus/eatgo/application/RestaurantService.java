package kr.co.fastcampus.eatgo.application;

import kr.co.fastcampus.eatgo.domain.Restaurant;
import kr.co.fastcampus.eatgo.domain.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RestaurantService {

 @Autowired
 RestaurantRepository restaurantRepository;

 public RestaurantService(RestaurantRepository restaurantRepository) {
     this.restaurantRepository = restaurantRepository;
 }

 public Restaurant getRestaurant(Long id) {

     Restaurant restaurant = restaurantRepository.findById(id);

//     System.out.println("5555");
     return restaurant;

 }

    public List<Restaurant> getRestaurants() {
     List<Restaurant> restaurants = restaurantRepository.findAll();

     return restaurants;
    }
}

