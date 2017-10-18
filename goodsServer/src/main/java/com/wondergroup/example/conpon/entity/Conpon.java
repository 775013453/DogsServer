package com.wondergroup.example.conpon.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
  * @ClassName: conpon
  * @Description: 实体类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */
 
@Entity
@Table(name="t_conpon") 
  
public class Conpon implements Serializable{  

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name="id",nullable=true,unique=false)
    private  String id;
    
  
	@Column(name="conponName",nullable=true,unique=false)
    private  String conponName;  
  
	@Column(name="conponDetail",nullable=true,unique=false)
    private  String conponDetail;  
  
	@Column(name="conponPrice",nullable=true,unique=false)
    private  String conponPrice;  
  
	@Column(name="used",nullable=true,unique=false)
    private  Integer used;  
      
 
    public void setConponName(String conponName){  
        this.conponName=conponName;  
    }  
      
    public String getConponName(){  
        return this.conponName;  
    }       
 
    public void setConponDetail(String conponDetail){  
        this.conponDetail=conponDetail;  
    }  
      
    public String getConponDetail(){  
        return this.conponDetail;  
    }       
 
    public void setConponPrice(String conponPrice){  
        this.conponPrice=conponPrice;  
    }  
      
    public String getConponPrice(){  
        return this.conponPrice;  
    }       
 
    public void setUsed(Integer used){  
        this.used=used;  
    }  
      
    public Integer getUsed(){  
        return this.used;  
    }       
}  