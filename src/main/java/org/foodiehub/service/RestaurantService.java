package org.foodiehub.service;

import org.foodiehub.dto.RestaurantDto;
import org.foodiehub.model.Restaurant;
import org.foodiehub.model.User;
import org.foodiehub.request.CreateRestaurantRequest;

import java.util.List;

public interface RestaurantService {

    public Restaurant createRestaurant(CreateRestaurantRequest req, User user);

    public Restaurant updateRestaurant(Long restaurantId,CreateRestaurantRequest updatedRestaurant)throws Exception;

    public void deleteRestaurant(Long restaurantId)throws Exception;

    public List<Restaurant> getAllRestaurant();

    public List<Restaurant> searchRestaurant(String keyword);

    public Restaurant findRestaurantById(Long userId)throws Exception;

    public Restaurant getRestaurantByUserId(Long id)throws Exception;

    public RestaurantDto addToFavourites(Long restaurantId, User user)throws Exception;
    public Restaurant updateRestaurantStatus(Long id)throws Exception;

}
