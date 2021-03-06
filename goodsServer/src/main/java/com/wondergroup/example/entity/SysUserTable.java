package com.wondergroup.example.entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sys_user_table")
public class SysUserTable implements java.io.Serializable {

	/**
	  *@Fields serialVersionUID:（用一句话描述这个变量表示什么）
	  */
	
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String loginName;
	private String loginPassword;
	private String userName;
	private String realName;
	private String identityNum;
	private String userAddr;
	private String userSexCode;
	private String userSexName;
	private String userPhone;
	private Float userMoney;
	private Float userMonetary;
	private String userImgPath;
	private Date userCreateDate;

	public SysUserTable() {
	}

	public SysUserTable(String id) {
		this.id = id;
	}

	public SysUserTable(String id, String loginName, String loginPassword,
			String userName, String realName, String identityNum,
			String userAddr, String userSexCode, String userSexName,
			String userPhone, Float userMoney, Float userMonetary,
			String userImgPath, Date userCreateDate) {
		this.id = id;
		this.loginName = loginName;
		this.loginPassword = loginPassword;
		this.userName = userName;
		this.realName = realName;
		this.identityNum = identityNum;
		this.userAddr = userAddr;
		this.userSexCode = userSexCode;
		this.userSexName = userSexName;
		this.userPhone = userPhone;
		this.userMoney = userMoney;
		this.userMonetary = userMonetary;
		this.userImgPath = userImgPath;
		this.userCreateDate = userCreateDate;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return this.loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdentityNum() {
		return this.identityNum;
	}

	public void setIdentityNum(String identityNum) {
		this.identityNum = identityNum;
	}

	public String getUserAddr() {
		return this.userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public String getUserSexCode() {
		return this.userSexCode;
	}

	public void setUserSexCode(String userSexCode) {
		this.userSexCode = userSexCode;
	}

	public String getUserSexName() {
		return this.userSexName;
	}

	public void setUserSexName(String userSexName) {
		this.userSexName = userSexName;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Float getUserMoney() {
		return this.userMoney;
	}

	public void setUserMoney(Float userMoney) {
		this.userMoney = userMoney;
	}

	public Float getUserMonetary() {
		return this.userMonetary;
	}

	public void setUserMonetary(Float userMonetary) {
		this.userMonetary = userMonetary;
	}

	public String getUserImgPath() {
		return this.userImgPath;
	}

	public void setUserImgPath(String userImgPath) {
		this.userImgPath = userImgPath;
	}

	public Date getUserCreateDate() {
		return this.userCreateDate;
	}

	public void setUserCreateDate(Date userCreateDate) {
		this.userCreateDate = userCreateDate;
	}

}
