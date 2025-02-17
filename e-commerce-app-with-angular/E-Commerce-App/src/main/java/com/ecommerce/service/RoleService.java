package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.RoleModel;
import com.ecommerce.repository.RoleRepository;

@Service
public class RoleService {
	
	
	@Autowired
	private RoleRepository roleRepository;
	
	public RoleModel creteModel(RoleModel roleModel) {
		return roleRepository.save(roleModel);
	}
	
}
