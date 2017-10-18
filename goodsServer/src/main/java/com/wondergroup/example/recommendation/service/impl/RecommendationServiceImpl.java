package com.wondergroup.example.recommendation.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wondergroup.example.recommendation.dao.RecommendationDao;
import com.wondergroup.example.recommendation.entity.Recommendation;
import com.wondergroup.example.recommendation.service.RecommendationService;


/**
  * @ClassName: recommendationServiceImpl
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

@Service
public class RecommendationServiceImpl implements RecommendationService{

	@Autowired
	RecommendationDao dao;
	
	@Override
	public List<Recommendation> getAllList() {
		// TODO Auto-generated method stub	
		return dao.getAllList();
	}

	@Override
	public Map<String,Object> getList(Recommendation entity,Integer page,Integer rows) {
		// TODO Auto-generated method stub
		return dao.getList(entity,page,rows);
	}

	@Override
	public void add(Recommendation entity) {
		// TODO Auto-generated method stub
		dao.add(entity);
		
	}

	@Override
	public void update(Recommendation entity) {
		// TODO Auto-generated method stub
		dao.update(entity);
	}

	@Override
	public void delete(Recommendation entity) {
		// TODO Auto-generated method stub
		dao.delete(entity);
	}
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows){
		return dao.getScopeList(entityList, page, rows);
	};

}

