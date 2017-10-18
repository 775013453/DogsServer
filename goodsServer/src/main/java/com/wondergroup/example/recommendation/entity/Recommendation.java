package com.wondergroup.example.recommendation.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
  * @ClassName: recommendation
  * @Description: 实体类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */
 
@Entity
@Table(name="t_recommendation") 
  
public class Recommendation implements Serializable{  

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name="id",nullable=true,unique=false)
    private  String id;
    
  
	@Column(name="goodsId",nullable=true,unique=false)
    private  String goodsId;  
  
	@Column(name="used",nullable=true,unique=false)
    private  Integer used;  
      
 
    public void setGoodsId(String goodsId){  
        this.goodsId=goodsId;  
    }  
      
    public String getGoodsId(){  
        return this.goodsId;  
    }       
 
    public void setUsed(Integer used){  
        this.used=used;  
    }  
      
    public Integer getUsed(){  
        return this.used;  
    }       
}  