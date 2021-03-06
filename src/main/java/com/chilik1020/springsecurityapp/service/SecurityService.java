package com.chilik1020.springsecurityapp.service;

/**
 * Service for Security.
 *
 * @author Andrey Demchuk
 * @version 1.0
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
