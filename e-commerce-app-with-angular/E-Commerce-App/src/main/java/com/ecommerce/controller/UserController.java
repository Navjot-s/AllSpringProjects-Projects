package com.ecommerce.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.UserModel;
import com.ecommerce.service.UserService;


@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	
	@PostMapping({"/registeredNewUser"})
	public UserModel registeredNewUser(@RequestBody UserModel userModel) {
		return userService.registeredNewUser(userModel);
	}
	
	@PostConstruct
	public void initUserAndRole() {
		userService.initUserAndUserRole();
	}
	
	@GetMapping({"/forAdmin"})
	public String forAdmin() {
		return "This URL is only accessible for admin";
	}
	
	@GetMapping({"/forUser"})
	public String forUser() {
		return "This URL is only accessible for user";
	}
	
}
