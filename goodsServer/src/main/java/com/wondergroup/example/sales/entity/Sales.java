package com.wondergroup.example.sales.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
  * @ClassName: sales
  * @Description: 实体类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */
 
@Entity
@Table(name="t_sales") 
  
public class Sales implements Serializable{  

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name="id",nullable=true,unique=false)
    private  String id;
    
  
	@Column(name="goodsId",nullable=true,unique=false)
    private  String goodsId;  
  
	@Column(name="salesVolume",nullable=true,unique=false)
    private  String salesVolume;  
  
	@Column(name="salesSurplus",nullable=true,unique=false)
    private  String salesSurplus;  
      
 
    public void setGoodsId(String goodsId){  
        this.goodsId=goodsId;  
    }  
      
    public String getGoodsId(){  
        return this.goodsId;  
    }       
 
    public void setSalesVolume(String salesVolume){  
        this.salesVolume=salesVolume;  
    }  
      
    public String getSalesVolume(){  
        return this.salesVolume;  
    }       
 
    public void setSalesSurplus(String salesSurplus){  
        this.salesSurplus=salesSurplus;  
    }  
      
    public String getSalesSurplus(){  
        return this.salesSurplus;  
    }       
}  