package com.wondergroup.example.score.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
  * @ClassName: score
  * @Description: 实体类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */
 
@Entity
@Table(name="t_score") 
  
public class Score implements Serializable{  

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name="id",nullable=true,unique=false)
    private  String id;
    
  
	@Column(name="goodsId",nullable=true,unique=false)
    private  String goodsId;  
  
	@Column(name="goodsScore",nullable=true,unique=false)
    private  String goodsScore;  
  
	@Column(name="userId",nullable=true,unique=false)
    private  String userId;  
  
	@Column(name="scoreDetail",nullable=true,unique=false)
    private  String scoreDetail;  
  
	@Column(name="used",nullable=true,unique=false)
    private  Integer used;  
      
 
    public void setGoodsId(String goodsId){  
        this.goodsId=goodsId;  
    }  
      
    public String getGoodsId(){  
        return this.goodsId;  
    }       
 
    public void setGoodsScore(String goodsScore){  
        this.goodsScore=goodsScore;  
    }  
      
    public String getGoodsScore(){  
        return this.goodsScore;  
    }       
 
    public void setUserId(String userId){  
        this.userId=userId;  
    }  
      
    public String getUserId(){  
        return this.userId;  
    }       
 
    public void setScoreDetail(String scoreDetail){  
        this.scoreDetail=scoreDetail;  
    }  
      
    public String getScoreDetail(){  
        return this.scoreDetail;  
    }       
 
    public void setUsed(Integer used){  
        this.used=used;  
    }  
      
    public Integer getUsed(){  
        return this.used;  
    }       
}  