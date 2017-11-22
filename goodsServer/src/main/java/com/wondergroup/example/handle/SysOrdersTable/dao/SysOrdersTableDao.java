package com.wondergroup.example.handle.SysOrdersTable.dao;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.entity.SysOrdersTable;

/**
  * @ClassName: SysOrdersTableDao
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface SysOrdersTableDao {
	
	public List<SysOrdersTable> getAllList();
	
	public Map<String,Object> getList(SysOrdersTable entity,Integer page,Integer rows);
	
	public void add(SysOrdersTable entity);
	
	public void update(SysOrdersTable entity);
	
	public void delete(SysOrdersTable entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
