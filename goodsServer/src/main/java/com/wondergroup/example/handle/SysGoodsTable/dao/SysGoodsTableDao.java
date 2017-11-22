package com.wondergroup.example.handle.SysGoodsTable.dao;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.entity.SysGoodsTable;

/**
  * @ClassName: SysGoodsTableDao
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface SysGoodsTableDao {
	
	public List<SysGoodsTable> getAllList();
	
	public Map<String,Object> getList(SysGoodsTable entity,Integer page,Integer rows);
	
	public void add(SysGoodsTable entity);
	
	public void update(SysGoodsTable entity);
	
	public void delete(SysGoodsTable entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
