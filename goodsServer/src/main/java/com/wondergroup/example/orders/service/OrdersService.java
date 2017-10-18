package com.wondergroup.example.orders.service;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.orders.entity.Orders;

/**
  * @ClassName: ordersService
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface OrdersService {
	
	public List<Orders> getAllList();
	
	public Map<String,Object> getList(Orders entity,Integer page,Integer rows);
	
	public void add(Orders entity);
	
	public void update(Orders entity);
	
	public void delete(Orders entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
