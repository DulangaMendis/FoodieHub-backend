package org.foodiehub.repository;

import org.foodiehub.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {

    @Query("Select r From Restaurant r Where lower(r.name)Like lower(concat('%',:query,'%'))"+
    "OR lower(r.cuisineType) Like lower(concat('%',:query,'%'))")
    List<Restaurant>findBySearchQuery(String query);
    Restaurant findByOwnerId(Long userId);


}
