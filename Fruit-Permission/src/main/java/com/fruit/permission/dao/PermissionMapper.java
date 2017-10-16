package com.fruit.permission.dao;

import com.fruit.permission.model.Permission;
import com.sun.tools.javac.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * ${DESCRIPTION}
 *
 * @author 张进
 * @create 2017-10-14 9:19
 **/
@Mapper
@Repository
public interface PermissionMapper {
    /**
     * 查询权限
     * @return
     */
    List<Permission> query();

    /**
     * 插入数据
     * @param permission
     * @return
     */
    int insertPermission(Permission permission);
}
