package org.foodiehub.controller;

import org.foodiehub.model.IngredientsCategory;
import org.foodiehub.model.IngredientsItem;
import org.foodiehub.request.IngredientCategoryRequest;
import org.foodiehub.request.IngredientRequest;
import org.foodiehub.service.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/ingredients")
public class IngredientController {

    @Autowired
    private IngredientsService ingredientsService;


    @PostMapping("/category")
    public ResponseEntity<IngredientsCategory>createIngredientCategory(
            @RequestBody IngredientCategoryRequest req
            )throws Exception{
        IngredientsCategory item=ingredientsService.createIngredientCategory(req.getName(), req.getRestaurantId());
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @PostMapping()
    public ResponseEntity<IngredientsItem>createIngredientItem(
            @RequestBody IngredientRequest req
    )throws Exception{
        IngredientsItem item=ingredientsService.createIngredientItem(req.getName(), req.getRestaurantId(), req.getCategoryId());
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @PutMapping("/{id}/stoke")
    public ResponseEntity<IngredientsItem>updateIngredientStock(
           @PathVariable Long id
    )throws Exception{
        IngredientsItem item=ingredientsService.updateStock(id);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }

    @GetMapping("/restaurant/{id}")
    public ResponseEntity<List<IngredientsItem>> getRestaurantIngredient(
            @PathVariable Long id
    )throws Exception{
        List<IngredientsItem> items=ingredientsService.findRestaurantsIngredients(id);
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @GetMapping("/restaurant/{id}/category")
    public ResponseEntity<List<IngredientsCategory>> getRestaurantIngredientCategory(
            @PathVariable Long id
    )throws Exception{
        List<IngredientsCategory> items=ingredientsService.findIngredientCategoryByRestaurantId(id);
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

}
