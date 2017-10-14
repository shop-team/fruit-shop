package com.fruit.permission.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * ${DESCRIPTION}
 *
 * @author 张进
 * @create 2017-10-06 10:21
 **/

public class Permission implements Serializable{

    private int  id;

    private String permissionName;

    private String permissionUrl;

    private String permissionRemark;

    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

    public String getPermissionRemark() {
        return permissionRemark;
    }

    public void setPermissionRemark(String permissionRemark) {
        this.permissionRemark = permissionRemark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
