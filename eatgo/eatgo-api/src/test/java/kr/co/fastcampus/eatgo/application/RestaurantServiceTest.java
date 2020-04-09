package kr.co.fastcampus.eatgo.application;

import kr.co.fastcampus.eatgo.domain.Restaurant;
import kr.co.fastcampus.eatgo.domain.RestaurantRepository;
import kr.co.fastcampus.eatgo.domain.RestaurantRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class RestaurantServiceTest {

    private RestaurantService restaurantService;

    private RestaurantRepository restaurantRepository;

    @BeforeEach
    public  void setUp() {
//        System.out.println("asdf");

        restaurantRepository = new RestaurantRepositoryImpl();
//        System.out.println("34343");
        restaurantService = new RestaurantService(restaurantRepository);
    }

    @Test
    public void getRestaurants() {
        List<Restaurant> restaurants = restaurantService.getRestaurants();
        Restaurant restaurant = restaurants.get(0);
        assertThat(restaurant.getId(), is(1004L));
    }

    @Test
    public void getRestaurant() {
//        System.out.println("0000");
//
//        System.out.println("111");
        Restaurant restaurant = restaurantService.getRestaurant(1004L);
//        System.out.println("2222");
       assertThat(restaurant.getId(), is(1004L));
    }



}