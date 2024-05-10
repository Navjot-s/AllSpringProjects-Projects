package com.ecommerce.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.RoleModel;
import com.ecommerce.model.UserModel;
import com.ecommerce.repository.RoleRepository;
import com.ecommerce.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	public UserModel registeredNewUser(UserModel userModel) {
		return userRepository.save(userModel);
	}
	
	public void initUserAndUserRole() {
		
		Set<RoleModel> adminRoleModel = roleRepository.findByRoleName("Admin");
		// user role
		Set<RoleModel> userRoleModel = roleRepository.findByRoleName("User");
		
		// Creating Admin User
		UserModel adminUserModel = new UserModel();
		adminUserModel.setUserName("Admin User");
		adminUserModel.setUserFirstName("Admin");
		adminUserModel.setUserLastName("User");
		adminUserModel.setUserPassword("admin1234");
		adminUserModel.setRoles(adminRoleModel);
		userRepository.save(adminUserModel);
		
		// Creating Noramal User
		UserModel normalUserModel = new UserModel();
		normalUserModel.setUserName("Normal User");
		normalUserModel.setUserFirstName("Normal");
		normalUserModel.setUserLastName("User");
		normalUserModel.setUserPassword("user1234");
		normalUserModel.setRoles(userRoleModel);
		userRepository.save(normalUserModel);
		
		
		
		
	}
	
	
}
