package com.restaurant.service.auth;

import com.restaurant.dtos.SignupRequest;
import com.restaurant.dtos.UserDto;


public interface AuthService {
	public UserDto createUser(SignupRequest signupRequest);
}
