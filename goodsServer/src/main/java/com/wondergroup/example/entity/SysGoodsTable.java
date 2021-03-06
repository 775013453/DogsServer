package com.wondergroup.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sys_goods_table")
public class SysGoodsTable implements java.io.Serializable {

	/**
	  *@Fields serialVersionUID:（用一句话描述这个变量表示什么）
	  */
	
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String goodsName;
	private Integer goodsTypeCode;
	private String goodsTypeName;
	private String goodsDetail;
	private String goodsFrom;
	private Float goodsPrice;
	private String goodsImgPath;
	private Integer goodsStock;
	private Integer goodsSales;
	private Integer used;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getGoodsTypeCode() {
		return this.goodsTypeCode;
	}

	public void setGoodsTypeCode(Integer goodsTypeCode) {
		this.goodsTypeCode = goodsTypeCode;
	}

	public String getGoodsTypeName() {
		return this.goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}

	public String getGoodsDetail() {
		return this.goodsDetail;
	}

	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getGoodsFrom() {
		return this.goodsFrom;
	}

	public void setGoodsFrom(String goodsFrom) {
		this.goodsFrom = goodsFrom;
	}

	public Float getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(Float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsImgPath() {
		return this.goodsImgPath;
	}

	public void setGoodsImgPath(String goodsImgPath) {
		this.goodsImgPath = goodsImgPath;
	}

	public Integer getGoodsStock() {
		return this.goodsStock;
	}

	public void setGoodsStock(Integer goodsStock) {
		this.goodsStock = goodsStock;
	}

	public Integer getGoodsSales() {
		return this.goodsSales;
	}

	public void setGoodsSales(Integer goodsSales) {
		this.goodsSales = goodsSales;
	}

	public Integer getUsed() {
		return this.used;
	}

	public void setUsed(Integer used) {
		this.used = used;
	}

}
