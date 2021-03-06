package com.wondergroup.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sys_score_table")
public class SysScoreTable implements java.io.Serializable {

	/**
	  *@Fields serialVersionUID:（用一句话描述这个变量表示什么）
	  */
	
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String userId;
	private String goodsId;
	private String evaluate;
	private Float score;
	private Integer used;

	public SysScoreTable() {
	}

	public SysScoreTable(String id) {
		this.id = id;
	}

	public SysScoreTable(String id, String userId, String goodsId,
			String evaluate, Float score, Integer used) {
		this.id = id;
		this.userId = userId;
		this.goodsId = goodsId;
		this.evaluate = evaluate;
		this.score = score;
		this.used = used;
	}

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

	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getEvaluate() {
		return this.evaluate;
	}

	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}

	public Float getScore() {
		return this.score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public Integer getUsed() {
		return this.used;
	}

	public void setUsed(Integer used) {
		this.used = used;
	}

}
