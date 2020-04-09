package kr.co.fastcampus.eatgo.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MenuItemRepositoryImpl implements MenuItemRepository {

    private List<MenuItem> menuItems = new ArrayList<>();

    public MenuItemRepositoryImpl() {
        menuItems.add(new MenuItem("Kimchi"));
        menuItems.add(new MenuItem("222"));
        System.out.println(menuItems.get(0));
    }

    @Override
    public List<MenuItem> findAllByRestaurantId(Long restaurantId) {
        return menuItems;
    }

}
