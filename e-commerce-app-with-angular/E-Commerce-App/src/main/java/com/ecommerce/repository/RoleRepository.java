package com.ecommerce.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.RoleModel;

public interface RoleRepository extends JpaRepository<RoleModel, String> {

	Set<RoleModel> findByRoleName(String string);

}
