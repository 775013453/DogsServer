package com.wondergroup.example.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sys_conpon_table")
public class SysConponTable implements Serializable {

	/**
	  *@Fields serialVersionUID:（用一句话描述这个变量表示什么）
	  */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;

	private String userId;

	private Integer code;

	private String came;

	private Float money;

	private Float sale;



	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getCame() {
		return this.came;
	}

	public void setCame(String came) {
		this.came = came;
	}

	public Float getMoney() {
		return this.money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	public Float getSale() {
		return this.sale;
	}

	public void setSale(Float sale) {
		this.sale = sale;
	}

}
