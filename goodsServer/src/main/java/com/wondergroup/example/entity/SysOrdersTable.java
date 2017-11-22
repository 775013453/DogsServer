package com.wondergroup.example.entity;

// Generated 2017-11-22 11:11:06 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SysOrdersTable generated by hbm2java
 */
@Entity
@Table(name="sys_orders_table")
public class SysOrdersTable implements java.io.Serializable {

	/**
	  *@Fields serialVersionUID:（用一句话描述这个变量表示什么）
	  */
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="ordersNum")
	private String ordersNum;
	
	@Column(name="userId")
	private String userId;
	
	@Column(name="goodsId")
	private String goodsId;
	
	@Column(name="goodsNum")
	private Integer goodsNum;
	
	@Column(name="goodsPrice")
	private Float goodsPrice;
	
	@Column(name="goodsMoney")
	private Float goodsMoney;
	
	@Column(name="ordersDate")
	private Date ordersDate;
	
	@Column(name="payDate")
	private Date payDate;
	
	@Column(name="deliverDate")
	private Date deliverDate;
	
	@Column(name="receiveDate")
	private Date receiveDate;
	
	@Column(name="consignee")
	private String consignee;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="address")
	private String address;
	
	@Column(name="used")
	private Integer used;

	public SysOrdersTable() {
	}

	public SysOrdersTable(String id) {
		this.id = id;
	}

	public SysOrdersTable(String id, String ordersNum, String userId,
			String goodsId, Integer goodsNum, Float goodsPrice,
			Float goodsMoney, Date ordersDate, Date payDate, Date deliverDate,
			Date receiveDate, String consignee, String phone, String address,
			Integer used) {
		this.id = id;
		this.ordersNum = ordersNum;
		this.userId = userId;
		this.goodsId = goodsId;
		this.goodsNum = goodsNum;
		this.goodsPrice = goodsPrice;
		this.goodsMoney = goodsMoney;
		this.ordersDate = ordersDate;
		this.payDate = payDate;
		this.deliverDate = deliverDate;
		this.receiveDate = receiveDate;
		this.consignee = consignee;
		this.phone = phone;
		this.address = address;
		this.used = used;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrdersNum() {
		return this.ordersNum;
	}

	public void setOrdersNum(String ordersNum) {
		this.ordersNum = ordersNum;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getGoodsNum() {
		return this.goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public Float getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(Float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Float getGoodsMoney() {
		return this.goodsMoney;
	}

	public void setGoodsMoney(Float goodsMoney) {
		this.goodsMoney = goodsMoney;
	}

	public Date getOrdersDate() {
		return this.ordersDate;
	}

	public void setOrdersDate(Date ordersDate) {
		this.ordersDate = ordersDate;
	}

	public Date getPayDate() {
		return this.payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public Date getDeliverDate() {
		return this.deliverDate;
	}

	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}

	public Date getReceiveDate() {
		return this.receiveDate;
	}

	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}

	public String getConsignee() {
		return this.consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getUsed() {
		return this.used;
	}

	public void setUsed(Integer used) {
		this.used = used;
	}

}