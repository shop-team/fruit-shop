package com.fruit.permission.model;




import cpm.fruit.utils.SysConstants;

import javax.persistence.*;
import java.sql.Date;

/**
 * ${DESCRIPTION}
 * 角色表
 * @author 张进
 * @create 2017-10-06 9:49
 **/
public class Role {


    private Long id;

    private String roleName;

    //角色状态 0正常 1锁定  2删除
    private int roleStatus = SysConstants.STATUS_NORMAL;


    private Date createTime;

    private String roleRemark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(int roleStatus) {
        this.roleStatus = roleStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRoleRemark() {
        return roleRemark;
    }

    public void setRoleRemark(String roleRemark) {
        this.roleRemark = roleRemark;
    }
}
