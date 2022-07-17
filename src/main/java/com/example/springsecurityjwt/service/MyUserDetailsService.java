package com.example.springsecurityjwt.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * User: milindasandaruwan
 * Date: 2022-07-08
 **/
@Service
public class MyUserDetailsService implements UserDetailsService {
    /**
     * Return user by username
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("test", "test123", new ArrayList<>());
    }
}
