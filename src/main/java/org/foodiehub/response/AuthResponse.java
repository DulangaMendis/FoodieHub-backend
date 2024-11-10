package org.foodiehub.response;

import lombok.Data;
import org.foodiehub.model.USER_ROLE;

@Data
public class AuthResponse {

    private String jwt;

    private String message;
    private USER_ROLE role;

}
