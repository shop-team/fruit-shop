package com.fruit.permission.service;

import com.fruit.permission.dao.PermissionMapper;
import com.fruit.permission.model.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ${DESCRIPTION}
 *
 * @author 张进
 * @create 2017-10-16 20:06
 **/
@Service
public class PermissionService {
	@Autowired
	PermissionMapper permissionMapper;

	@Transactional(readOnly = false, rollbackFor = Exception.class)
	public int insertPermission(Permission permission) {
		return permissionMapper.insertPermission(permission);
	}
}