package org.foodiehub.service;

import org.foodiehub.model.IngredientsCategory;
import org.foodiehub.model.IngredientsItem;

import java.util.List;

public interface IngredientsService {

    public IngredientsCategory createIngredientCategory(String name,Long restaurantId)throws Exception;

    public IngredientsCategory findIngredientCategoryById(Long id)throws Exception;
    public List<IngredientsCategory> findIngredientCategoryByRestaurantId(Long id)throws Exception;
    public IngredientsItem createIngredientItem(String ingredientName, Long restaurantId,Long categoryId)throws Exception;

    public List<IngredientsItem> findRestaurantsIngredients(Long restaurantId);

    public IngredientsItem updateStock(Long id)throws Exception;



}
