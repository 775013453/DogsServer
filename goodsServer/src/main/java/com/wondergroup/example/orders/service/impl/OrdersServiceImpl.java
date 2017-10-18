package com.wondergroup.example.orders.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wondergroup.example.orders.dao.OrdersDao;
import com.wondergroup.example.orders.entity.Orders;
import com.wondergroup.example.orders.service.OrdersService;


/**
  * @ClassName: ordersServiceImpl
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

@Service
public class OrdersServiceImpl implements OrdersService{

	@Autowired
	OrdersDao dao;
	
	@Override
	public List<Orders> getAllList() {
		// TODO Auto-generated method stub	
		return dao.getAllList();
	}

	@Override
	public Map<String,Object> getList(Orders entity,Integer page,Integer rows) {
		// TODO Auto-generated method stub
		return dao.getList(entity,page,rows);
	}

	@Override
	public void add(Orders entity) {
		// TODO Auto-generated method stub
		dao.add(entity);
		
	}

	@Override
	public void update(Orders entity) {
		// TODO Auto-generated method stub
		dao.update(entity);
	}

	@Override
	public void delete(Orders entity) {
		// TODO Auto-generated method stub
		dao.delete(entity);
	}
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows){
		return dao.getScopeList(entityList, page, rows);
	};

}

