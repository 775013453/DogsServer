package com.wondergroup.example.score.service;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.score.entity.Score;

/**
  * @ClassName: scoreService
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface ScoreService {
	
	public List<Score> getAllList();
	
	public Map<String,Object> getList(Score entity,Integer page,Integer rows);
	
	public void add(Score entity);
	
	public void update(Score entity);
	
	public void delete(Score entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
