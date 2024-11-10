package org.foodiehub.service;

import org.foodiehub.model.User;
import org.springframework.stereotype.Service;


public interface UserService {

    public User findUserByJwtToken(String jwt) throws Exception;
    public User findUserByEmail(String email) throws Exception;
}
