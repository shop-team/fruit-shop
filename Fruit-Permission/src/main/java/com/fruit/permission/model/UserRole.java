package com.fruit.permission.model;

/**
 * ${DESCRIPTION} 用户角色表
 * 
 * @author 张进
 * @create 2017-10-06 9:47
 **/
public class UserRole {
	private Long id;
	private Long userId;
	private Long roleId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
}