package org.foodiehub.request;

import lombok.Data;
import org.foodiehub.model.Category;
import org.foodiehub.model.IngredientsItem;

import java.util.List;

@Data
public class CreateFoodRequest {
    private String name;
    private String description;
    private Long price;
    private Category category;
    private List<String> image;
    private Long restaurantId;
    private boolean vegetarian;
    private boolean seasional;
    private List<IngredientsItem> ingredients;
}
