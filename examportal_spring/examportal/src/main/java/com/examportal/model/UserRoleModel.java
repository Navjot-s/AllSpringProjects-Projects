package com.examportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="userRole")
public class UserRoleModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userRole;
	@ManyToOne(fetch=FetchType.EAGER)
	
	private UserModel user;
	
}
