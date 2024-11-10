package org.foodiehub.service;

import org.foodiehub.model.Cart;
import org.foodiehub.model.CartItem;
import org.foodiehub.request.AddCartItemRequest;

public interface CartService {

    public CartItem addItemToCart(AddCartItemRequest req , String jwt)throws Exception;

    public CartItem updateCartItemQuantity(Long cartItemId,int quantity)throws Exception;

    public Cart removeItemFromCart(Long cartItemId,String jwt)throws Exception;

    public Long calculateCartTotals(Cart cart)throws Exception;

    public Cart findCartIById(Long id)throws Exception;

    public Cart findCartByUserId(Long userId)throws Exception;

    public Cart clearCart(Long userId)throws Exception;



}
