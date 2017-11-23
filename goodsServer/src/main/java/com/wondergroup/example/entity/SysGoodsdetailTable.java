package com.wondergroup.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sys_goodsdetail_table")
public class SysGoodsdetailTable implements java.io.Serializable {

	/**
	  *@Fields serialVersionUID:（用一句话描述这个变量表示什么）
	  */
	
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String goodsId;
	private String goodsDetail;
	private String goodsImgPath;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsDetail() {
		return this.goodsDetail;
	}

	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getGoodsImgPath() {
		return this.goodsImgPath;
	}

	public void setGoodsImgPath(String goodsImgPath) {
		this.goodsImgPath = goodsImgPath;
	}

}
