package org.foodiehub.request;

import lombok.Data;
import org.foodiehub.model.Address;
import org.foodiehub.model.ContactInformations;

import java.util.List;

@Data
public class CreateRestaurantRequest {
    private String id;
    private String name;
    private String description;
    private String cuisineType;
    private Address address;  // or AddressDto if you prefer using a DTO
    private ContactInformations contactInformations;
    private String openingHours;
    private List<String> image;

}
