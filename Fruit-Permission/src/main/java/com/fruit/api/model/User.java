package com.fruit.api.model;

import com.lost.until.SysConstants;

import javax.persistence.*;
import java.sql.Date;

/**
 * ${DESCRIPTION}
 * 用户实体
 * @author 张进
 * @create 2017-10-06 9:30
 **/
@Entity
@Table(name = "user")
public class User {
    @Id
    //mysql自增主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false,unique = true)
    private int id;

    //用户名称
    @Column(name = "user_name", nullable = false)
    private String userName;

    //密码
    @Column(name = "password",nullable = false)
    private String password;

    //用户类型
    @Column(name = "user_type",nullable = false)
    private String userType;

    //账户状态 0正常  1锁定  2删除
    @Column(name = "user_status",nullable = false)
    private int userStatus = SysConstants.STATUS_NORMAL;

    //创建时间
    @Column(name = "create_time",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date creteTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public Date getCreteTime() {
        return creteTime;
    }

    public void setCreteTime(Date creteTime) {
        this.creteTime = creteTime;
    }
}
