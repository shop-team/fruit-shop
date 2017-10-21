package com.fruit.permission.model;

import com.fruit.utils.SysConstants;
import java.sql.Date;

/**
 * ${DESCRIPTION} 用户实体
 * 
 * @author 张进
 * @create 2017-10-06 9:30
 **/
public class User {

	private int id;

	/** 用户名称 */
	private String userName;

	/** 密码 */
	private String password;

	/** 用户类型 */
	private String userType;

	/** 账户状态 0正常 1锁定 2删除 */
	private int userStatus = SysConstants.STATUS_NORMAL;

	/** 创建时间 */
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