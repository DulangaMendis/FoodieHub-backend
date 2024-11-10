package org.foodiehub.repository;

import org.foodiehub.model.Cart;
import org.foodiehub.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    Cart findByCustomerId(Long userId); // Finds cart based on userId
}
