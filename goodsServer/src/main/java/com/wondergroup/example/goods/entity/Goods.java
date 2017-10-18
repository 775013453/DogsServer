package com.wondergroup.example.goods.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
  * @ClassName: goods
  * @Description: 实体类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */
 
@Entity
@Table(name="t_goods") 
  
public class Goods implements Serializable{  

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name="id",nullable=true,unique=false)
    private  String id;
 
  
	@Column(name="goodsName",nullable=true,unique=false)
    private  String goodsName;  
  
	@Column(name="goodsType",nullable=true,unique=false)
    private  String goodsType;  
  
	@Column(name="goodsDetail",nullable=true,unique=false)
    private  String goodsDetail;  
  
	@Column(name="goodsFrom",nullable=true,unique=false)
    private  String goodsFrom;  
  
	@Column(name="goodsFormat",nullable=true,unique=false)
    private  Integer goodsFormat;  
  
	@Column(name="goodsPrice",nullable=true,unique=false)
    private  Integer goodsPrice;  
  
	@Column(name="used",nullable=true,unique=false)
    private  Integer used;  
      
 
    public void setId(String id){  
        this.id=id;  
    }  
      
    public String getId(){  
        return this.id;  
    }       
 
    public void setGoodsName(String goodsName){  
        this.goodsName=goodsName;  
    }  
      
    public String getGoodsName(){  
        return this.goodsName;  
    }       
 
    public void setGoodsType(String goodsType){  
        this.goodsType=goodsType;  
    }  
      
    public String getGoodsType(){  
        return this.goodsType;  
    }       
 
    public void setGoodsDetail(String goodsDetail){  
        this.goodsDetail=goodsDetail;  
    }  
      
    public String getGoodsDetail(){  
        return this.goodsDetail;  
    }       
 
    public void setGoodsFrom(String goodsFrom){  
        this.goodsFrom=goodsFrom;  
    }  
      
    public String getGoodsFrom(){  
        return this.goodsFrom;  
    }       
 
    public void setGoodsFormat(Integer goodsFormat){  
        this.goodsFormat=goodsFormat;  
    }  
      
    public Integer getGoodsFormat(){  
        return this.goodsFormat;  
    }       
 
    public void setGoodsPrice(Integer goodsPrice){  
        this.goodsPrice=goodsPrice;  
    }  
      
    public Integer getGoodsPrice(){  
        return this.goodsPrice;  
    }       
 
    public void setUsed(Integer used){  
        this.used=used;  
    }  
      
    public Integer getUsed(){  
        return this.used;  
    }       
}  