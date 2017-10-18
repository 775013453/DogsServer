package com.wondergroup.example.score.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wondergroup.example.score.dao.ScoreDao;
import com.wondergroup.example.score.entity.Score;
import com.wondergroup.example.score.service.ScoreService;


/**
  * @ClassName: scoreServiceImpl
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

@Service
public class ScoreServiceImpl implements ScoreService{

	@Autowired
	ScoreDao dao;
	
	@Override
	public List<Score> getAllList() {
		// TODO Auto-generated method stub	
		return dao.getAllList();
	}

	@Override
	public Map<String,Object> getList(Score entity,Integer page,Integer rows) {
		// TODO Auto-generated method stub
		return dao.getList(entity,page,rows);
	}

	@Override
	public void add(Score entity) {
		// TODO Auto-generated method stub
		dao.add(entity);
		
	}

	@Override
	public void update(Score entity) {
		// TODO Auto-generated method stub
		dao.update(entity);
	}

	@Override
	public void delete(Score entity) {
		// TODO Auto-generated method stub
		dao.delete(entity);
	}
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows){
		return dao.getScopeList(entityList, page, rows);
	};

}

