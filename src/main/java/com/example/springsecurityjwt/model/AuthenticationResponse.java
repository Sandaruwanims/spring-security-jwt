package com.example.springsecurityjwt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * User: milindasandaruwan
 * Date: 2022-07-08
 **/
@Getter
@AllArgsConstructor
public class AuthenticationResponse {
    private final String jwt;
}
