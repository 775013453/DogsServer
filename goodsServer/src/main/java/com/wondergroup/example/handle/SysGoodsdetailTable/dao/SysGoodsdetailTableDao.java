package com.wondergroup.example.handle.SysGoodsdetailTable.dao;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.entity.SysGoodsdetailTable;

/**
  * @ClassName: SysGoodsdetailTableDao
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface SysGoodsdetailTableDao {
	
	public List<SysGoodsdetailTable> getAllList();
	
	public Map<String,Object> getList(SysGoodsdetailTable entity,Integer page,Integer rows);
	
	public void add(SysGoodsdetailTable entity);
	
	public void update(SysGoodsdetailTable entity);
	
	public void delete(SysGoodsdetailTable entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
