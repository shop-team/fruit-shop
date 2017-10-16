package com.fruit.permission.dao;

import com.fruit.permission.model.Permission;
import com.sun.tools.javac.util.List;
import org.springframework.stereotype.Repository;

/**
 * ${DESCRIPTION}
 *
 * @author 张进
 * @create 2017-10-14 9:19
 **/
@Repository
public interface PermissionMapper {
    /**
     * 查询权限
     * @return
     */
    List<Permission> query();
}
