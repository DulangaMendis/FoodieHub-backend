package org.foodiehub.repository;

import org.foodiehub.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Cart findByCustomerId(Long userId); // Retrieves a Cart based on the userId
}
