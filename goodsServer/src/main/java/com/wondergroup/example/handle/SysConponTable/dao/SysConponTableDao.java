package com.wondergroup.example.handle.SysConponTable.dao;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.entity.SysConponTable;

/**
  * @ClassName: SysConponTableDao
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface SysConponTableDao {
	
	public List<SysConponTable> getAllList();
	
	public Map<String,Object> getList(SysConponTable entity,Integer page,Integer rows);
	
	public void add(SysConponTable entity);
	
	public void update(SysConponTable entity);
	
	public void delete(SysConponTable entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
