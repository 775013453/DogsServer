package com.wondergroup.example.goodsRelatePic.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wondergroup.example.goodsRelatePic.dao.GoodsRelatePicDao;
import com.wondergroup.example.goodsRelatePic.entity.GoodsRelatePic;
import com.wondergroup.example.goodsRelatePic.service.GoodsRelatePicService;


/**
  * @ClassName: goodsRelatePicServiceImpl
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

@Service
public class GoodsRelatePicServiceImpl implements GoodsRelatePicService{

	@Autowired
	GoodsRelatePicDao dao;
	
	@Override
	public List<GoodsRelatePic> getAllList() {
		// TODO Auto-generated method stub	
		return dao.getAllList();
	}

	@Override
	public Map<String,Object> getList(GoodsRelatePic entity,Integer page,Integer rows) {
		// TODO Auto-generated method stub
		return dao.getList(entity,page,rows);
	}

	@Override
	public void add(GoodsRelatePic entity) {
		// TODO Auto-generated method stub
		dao.add(entity);
		
	}

	@Override
	public void update(GoodsRelatePic entity) {
		// TODO Auto-generated method stub
		dao.update(entity);
	}

	@Override
	public void delete(GoodsRelatePic entity) {
		// TODO Auto-generated method stub
		dao.delete(entity);
	}
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows){
		return dao.getScopeList(entityList, page, rows);
	};

}

