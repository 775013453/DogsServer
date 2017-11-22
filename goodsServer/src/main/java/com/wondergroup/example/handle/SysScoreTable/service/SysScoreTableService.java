package com.wondergroup.example.handle.SysScoreTable.service;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.entity.SysScoreTable;

/**
  * @ClassName: SysScoreTableService
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface SysScoreTableService {
	
	public List<SysScoreTable> getAllList();
	
	public Map<String,Object> getList(SysScoreTable entity,Integer page,Integer rows);
	
	public void add(SysScoreTable entity);
	
	public void update(SysScoreTable entity);
	
	public void delete(SysScoreTable entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
