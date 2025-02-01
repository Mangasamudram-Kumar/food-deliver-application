package com.fooddelivery.service;

import com.fooddelivery.model.Dish;
import com.fooddelivery.model.RestaurantInfo;
import java.util.List;

public interface SearchEngineService {
  void addRestaurant(String word, String restaurantId);
  List<String> searchRestaurant(String word);
  void removeRestaurant(String word, String restaurantId);
  void eraseInfo(RestaurantInfo info, String restaurantId);
  void eraseDishes(List<Dish> dishes, String restaurantId);
  void updateInfo(RestaurantInfo info, String restaurantId);
}
