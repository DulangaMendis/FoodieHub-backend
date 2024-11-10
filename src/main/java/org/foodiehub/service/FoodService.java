package org.foodiehub.service;

import org.foodiehub.model.Category;
import org.foodiehub.model.Food;
import org.foodiehub.model.Restaurant;
import org.foodiehub.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId)throws Exception;

    public List<Food> getRestaurantFood(Long restaurantId,boolean isVegitarain,boolean isNonveg,boolean isSeasonal,String foodCategory);

    public List<Food> searchFood(String keyword);

    public Food findFoodById(Long foodId)throws Exception;

    public Food updateAvailibityStatus(Long foodId)throws Exception;





}
