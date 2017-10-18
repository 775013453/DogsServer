package com.wondergroup.example.user.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
  * @ClassName: user
  * @Description: 实体类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */
 
@Entity
@Table(name="t_user") 
  
public class User implements Serializable{  

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name="id",nullable=true,unique=false)
    private  String id;
    
  
	@Column(name="userLoginName",nullable=true,unique=false)
    private  String userLoginName;  
  
	@Column(name="userAddr",nullable=true,unique=false)
    private  String userAddr;  
  
	@Column(name="userPhone",nullable=true,unique=false)
    private  String userPhone;  
  
	@Column(name="userSex",nullable=true,unique=false)
    private  String userSex;  
  
	@Column(name="userCreatDate",nullable=true,unique=false)
    private  Integer userCreatDate;  
  
	@Column(name="userCouponId",nullable=true,unique=false)
    private  Integer userCouponId;  
  
	@Column(name="userPrice",nullable=true,unique=false)
    private  Integer userPrice;  
  
	@Column(name="userName",nullable=true,unique=false)
    private  Integer userName;  
  
	@Column(name="userPic",nullable=true,unique=false)
    private  Integer userPic;  
      
 
    public void setUserLoginName(String userLoginName){  
        this.userLoginName=userLoginName;  
    }  
      
    public String getUserLoginName(){  
        return this.userLoginName;  
    }       
 
    public void setUserAddr(String userAddr){  
        this.userAddr=userAddr;  
    }  
      
    public String getUserAddr(){  
        return this.userAddr;  
    }       
 
    public void setUserPhone(String userPhone){  
        this.userPhone=userPhone;  
    }  
      
    public String getUserPhone(){  
        return this.userPhone;  
    }       
 
    public void setUserSex(String userSex){  
        this.userSex=userSex;  
    }  
      
    public String getUserSex(){  
        return this.userSex;  
    }       
 
    public void setUserCreatDate(Integer userCreatDate){  
        this.userCreatDate=userCreatDate;  
    }  
      
    public Integer getUserCreatDate(){  
        return this.userCreatDate;  
    }       
 
    public void setUserCouponId(Integer userCouponId){  
        this.userCouponId=userCouponId;  
    }  
      
    public Integer getUserCouponId(){  
        return this.userCouponId;  
    }       
 
    public void setUserPrice(Integer userPrice){  
        this.userPrice=userPrice;  
    }  
      
    public Integer getUserPrice(){  
        return this.userPrice;  
    }       
 
    public void setUserName(Integer userName){  
        this.userName=userName;  
    }  
      
    public Integer getUserName(){  
        return this.userName;  
    }       
 
    public void setUserPic(Integer userPic){  
        this.userPic=userPic;  
    }  
      
    public Integer getUserPic(){  
        return this.userPic;  
    }       
}  