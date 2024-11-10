package org.foodiehub.request;

import lombok.Data;
import org.foodiehub.model.Address;

@Data
public class OrderRequest {
    private Long restaurantId;
    private Address diliveryAddress;

}
