package com.wondergroup.example.recommendation.dao;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.recommendation.entity.Recommendation;

/**
  * @ClassName: recommendationDao
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface RecommendationDao {
	
	public List<Recommendation> getAllList();
	
	public Map<String,Object> getList(Recommendation entity,Integer page,Integer rows);
	
	public void add(Recommendation entity);
	
	public void update(Recommendation entity);
	
	public void delete(Recommendation entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
