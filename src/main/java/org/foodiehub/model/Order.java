package org.foodiehub.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User customer;

    private Long totalAmount;
    private String orderStatus;
    private Date createdAt;
    private Integer totalItems;
    private Long totalPrice;

    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;

    @ManyToOne
    private Address deliveryAddress;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items;

}
