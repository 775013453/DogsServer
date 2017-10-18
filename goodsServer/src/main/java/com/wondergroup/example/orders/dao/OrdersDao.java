package com.wondergroup.example.orders.dao;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.orders.entity.Orders;

/**
  * @ClassName: ordersDao
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface OrdersDao {
	
	public List<Orders> getAllList();
	
	public Map<String,Object> getList(Orders entity,Integer page,Integer rows);
	
	public void add(Orders entity);
	
	public void update(Orders entity);
	
	public void delete(Orders entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
