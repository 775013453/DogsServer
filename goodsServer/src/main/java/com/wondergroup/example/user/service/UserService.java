package com.wondergroup.example.user.service;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.user.entity.User;

/**
  * @ClassName: userService
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface UserService {
	
	public List<User> getAllList();
	
	public Map<String,Object> getList(User entity,Integer page,Integer rows);
	
	public void add(User entity);
	
	public void update(User entity);
	
	public void delete(User entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
