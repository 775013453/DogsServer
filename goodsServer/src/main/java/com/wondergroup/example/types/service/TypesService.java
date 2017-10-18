package com.wondergroup.example.types.service;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.types.entity.Types;

/**
  * @ClassName: typesService
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface TypesService {
	
	public List<Types> getAllList();
	
	public Map<String,Object> getList(Types entity,Integer page,Integer rows);
	
	public void add(Types entity);
	
	public void update(Types entity);
	
	public void delete(Types entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
