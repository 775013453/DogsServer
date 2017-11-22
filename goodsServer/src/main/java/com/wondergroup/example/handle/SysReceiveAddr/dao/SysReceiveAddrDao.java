package com.wondergroup.example.handle.SysReceiveAddr.dao;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.entity.SysReceiveAddr;

/**
  * @ClassName: SysReceiveAddrDao
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface SysReceiveAddrDao {
	
	public List<SysReceiveAddr> getAllList();
	
	public Map<String,Object> getList(SysReceiveAddr entity,Integer page,Integer rows);
	
	public void add(SysReceiveAddr entity);
	
	public void update(SysReceiveAddr entity);
	
	public void delete(SysReceiveAddr entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
