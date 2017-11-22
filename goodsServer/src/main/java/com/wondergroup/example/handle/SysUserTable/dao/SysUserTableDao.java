package com.wondergroup.example.handle.SysUserTable.dao;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.entity.SysUserTable;

/**
  * @ClassName: SysUserTableDao
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface SysUserTableDao {
	
	public List<SysUserTable> getAllList();
	
	public Map<String,Object> getList(SysUserTable entity,Integer page,Integer rows);
	
	public void add(SysUserTable entity);
	
	public void update(SysUserTable entity);
	
	public void delete(SysUserTable entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
