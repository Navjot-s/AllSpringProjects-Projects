package com.examportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="roles")
public class RoleModel {
	
	@Id
	private Long roleId;
	private String roleName;
	
	
	
	public RoleModel(Long roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}
	public RoleModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
