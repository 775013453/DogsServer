package com.wondergroup.example.types.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
  * @ClassName: types
  * @Description: 实体类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */
 
@Entity
@Table(name="t_types") 
  
public class Types implements Serializable{  

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name="id",nullable=true,unique=false)
    private  String id;
    
  
	@Column(name="goodsType",nullable=true,unique=false)
    private  String goodsType;  
  
	@Column(name="goodsName",nullable=true,unique=false)
    private  String goodsName;  
  
	@Column(name="typeDetail",nullable=true,unique=false)
    private  String typeDetail;  
      
 
    public void setGoodsType(String goodsType){  
        this.goodsType=goodsType;  
    }  
      
    public String getGoodsType(){  
        return this.goodsType;  
    }       
 
    public void setGoodsName(String goodsName){  
        this.goodsName=goodsName;  
    }  
      
    public String getGoodsName(){  
        return this.goodsName;  
    }       
 
    public void setTypeDetail(String typeDetail){  
        this.typeDetail=typeDetail;  
    }  
      
    public String getTypeDetail(){  
        return this.typeDetail;  
    }       
}  