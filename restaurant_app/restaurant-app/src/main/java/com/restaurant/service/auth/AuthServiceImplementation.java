package com.restaurant.service.auth;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.restaurant.dtos.SignupRequest;
import com.restaurant.dtos.UserDto;
import com.restaurant.enums.UserRole;
import com.restaurant.model.UserModel;
import com.restaurant.repositories.UserRepository;

@Service
public class AuthServiceImplementation implements AuthService{

private final UserRepository userRepository;
	
	public AuthServiceImplementation(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDto createUser(SignupRequest signupRequest) {
		UserModel createdUserModel = new UserModel();
		createdUserModel.setName(signupRequest.getName());
		createdUserModel.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
		createdUserModel.setEmail(signupRequest.getEmail());
		createdUserModel.setUserRole(UserRole.CUSTOMER);
		userRepository.save(createdUserModel);
		UserDto createdUserDto = new UserDto();
		createdUserDto.setId(createdUserModel.getId());
		createdUserDto.setName(createdUserModel.getName());
		createdUserDto.setEmail(createdUserModel.getEmail());
		createdUserDto.setUserRole(createdUserModel.getUserRole());
		return createdUserDto;
	}
	
}
