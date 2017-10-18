package com.wondergroup.example.conpon.dao;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.conpon.entity.Conpon;

/**
  * @ClassName: conponDao
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface ConponDao {
	
	public List<Conpon> getAllList();
	
	public Map<String,Object> getList(Conpon entity,Integer page,Integer rows);
	
	public void add(Conpon entity);
	
	public void update(Conpon entity);
	
	public void delete(Conpon entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
