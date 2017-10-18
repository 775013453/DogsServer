package com.wondergroup.example.goods.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wondergroup.example.goods.dao.GoodsDao;
import com.wondergroup.example.goods.entity.Goods;
import com.wondergroup.example.goods.service.GoodsService;


/**
  * @ClassName: goodsServiceImpl
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	GoodsDao dao;
	
	@Override
	public List<Goods> getAllList() {
		// TODO Auto-generated method stub	
		return dao.getAllList();
	}

	@Override
	public Map<String,Object> getList(Goods entity,Integer page,Integer rows) {
		// TODO Auto-generated method stub
		return dao.getList(entity,page,rows);
	}

	@Override
	public void add(Goods entity) {
		// TODO Auto-generated method stub
		dao.add(entity);
		
	}

	@Override
	public void update(Goods entity) {
		// TODO Auto-generated method stub
		dao.update(entity);
	}

	@Override
	public void delete(Goods entity) {
		// TODO Auto-generated method stub
		dao.delete(entity);
	}
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows){
		return dao.getScopeList(entityList, page, rows);
	};

}

