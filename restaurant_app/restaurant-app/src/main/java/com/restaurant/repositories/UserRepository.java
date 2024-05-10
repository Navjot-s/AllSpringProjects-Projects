package com.restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{


}
