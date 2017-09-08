package com.chilik1020.springsecurityapp.service;

import com.chilik1020.springsecurityapp.model.User;

/**
 * Service class for {@link com.chilik1020.springsecurityapp.model.User}
 *
 * @author Andrey Demchuk
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
