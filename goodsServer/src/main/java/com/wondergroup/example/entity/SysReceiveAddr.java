package com.wondergroup.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
// Generated 2017-11-22 11:11:06 by Hibernate Tools 3.4.0.CR1
import javax.persistence.Table;

@Entity
@Table(name="sys_receive_addr")
public class SysReceiveAddr  implements java.io.Serializable {


     /**
	  *@Fields serialVersionUID:（用一句话描述这个变量表示什么）
	  */
	
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
    private String userId;
    private String name;
    private String phone;
    private String address;

    public SysReceiveAddr() {
    }

	
    public SysReceiveAddr(String id) {
        this.id = id;
    }
    public SysReceiveAddr(String id, String userId, String name, String phone, String address) {
       this.id = id;
       this.userId = userId;
       this.name = name;
       this.phone = phone;
       this.address = address;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getuserId() {
        return this.userId;
    }
    
    public void setuserId(String userId) {
        this.userId = userId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }




}


