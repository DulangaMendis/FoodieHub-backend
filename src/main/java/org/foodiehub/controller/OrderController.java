package org.foodiehub.controller;

import org.foodiehub.model.CartItem;
import org.foodiehub.model.Order;
import org.foodiehub.model.User;
import org.foodiehub.request.AddCartItemRequest;
import org.foodiehub.request.OrderRequest;
import org.foodiehub.service.OrderService;
import org.foodiehub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;

    @PostMapping("/order")
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest req,
                                                  @RequestHeader("Authorization")String jwt)throws Exception{
        User user=userService.findUserByJwtToken(jwt);
        Order order=orderService.createOrder(req,user);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @GetMapping("/order/user")
    public ResponseEntity <List<Order>> getOrderHistory(@RequestHeader("Authorization")String jwt)throws Exception{
        User user=userService.findUserByJwtToken(jwt);
        List<Order> orders=orderService.getUsersOrder(user.getId());
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
}
