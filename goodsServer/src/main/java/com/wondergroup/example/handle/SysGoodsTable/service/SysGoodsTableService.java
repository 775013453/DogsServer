package com.wondergroup.example.handle.SysGoodsTable.service;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.entity.SysGoodsTable;

/**
  * @ClassName: SysGoodsTableService
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface SysGoodsTableService {
	
	public List<SysGoodsTable> getAllList();
	
	public Map<String,Object> getList(SysGoodsTable entity,Integer page,Integer rows);
	
	public void add(SysGoodsTable entity);
	
	public void update(SysGoodsTable entity);
	
	public void delete(SysGoodsTable entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
