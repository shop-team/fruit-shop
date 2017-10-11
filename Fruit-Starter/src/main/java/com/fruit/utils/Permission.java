package com.fruit.utils;

import javax.persistence.*;
import java.util.Date;

/**
 * ${DESCRIPTION}
 *
 * @author 张进
 * @create 2017-10-06 10:21
 **/
@Entity
@Table(name = "permission")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false,unique = true)
    private Long  id;

    @Column(name = "permission_name",nullable = false)
    private String permissionName;

    @Column(name = "permission_url",nullable = false)
    private String permissionUrl;

    @Column(name = "permission_remark")
    private String permissionRemark;

    @Column(name = "create_time",nullable = false)
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
