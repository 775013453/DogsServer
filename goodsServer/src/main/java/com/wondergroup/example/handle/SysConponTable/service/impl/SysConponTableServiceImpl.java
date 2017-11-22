package com.wondergroup.example.handle.SysConponTable.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wondergroup.example.handle.SysConponTable.dao.SysConponTableDao;
import com.wondergroup.example.handle.SysConponTable.entity.SysConponTable;
import com.wondergroup.example.handle.SysConponTable.service.SysConponTableService;


/**
  * @ClassName: SysConponTableServiceImpl
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

@Service
public class SysConponTableServiceImpl implements SysConponTableService{

	@Autowired
	SysConponTableDao dao;
	
	public List<SysConponTable> getAllList() {
		// TODO Auto-generated method stub	
		return dao.getAllList();
	}

	public Map<String,Object> getList(SysConponTable entity,Integer page,Integer rows) {
		// TODO Auto-generated method stub
		return dao.getList(entity,page,rows);
	}

	public void add(SysConponTable entity) {
		// TODO Auto-generated method stub
		dao.add(entity);
		
	}

	public void update(SysConponTable entity) {
		// TODO Auto-generated method stub
		dao.update(entity);
	}

	public void delete(SysConponTable entity) {
		// TODO Auto-generated method stub
		dao.delete(entity);
	}
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows){
		return dao.getScopeList(entityList, page, rows);
	};

}

