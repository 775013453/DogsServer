package com.wondergroup.example.sales.dao;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.sales.entity.Sales;

/**
  * @ClassName: salesDao
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface SalesDao {
	
	public List<Sales> getAllList();
	
	public Map<String,Object> getList(Sales entity,Integer page,Integer rows);
	
	public void add(Sales entity);
	
	public void update(Sales entity);
	
	public void delete(Sales entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
