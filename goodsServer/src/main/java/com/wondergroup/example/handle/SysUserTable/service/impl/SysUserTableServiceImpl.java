package com.wondergroup.example.handle.SysUserTable.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wondergroup.example.handle.SysUserTable.dao.SysUserTableDao;
import com.wondergroup.example.entity.SysUserTable;
import com.wondergroup.example.handle.SysUserTable.service.SysUserTableService;


/**
  * @ClassName: SysUserTableServiceImpl
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

@Service
public class SysUserTableServiceImpl implements SysUserTableService{

	@Autowired
	SysUserTableDao dao;
	
	public List<SysUserTable> getAllList() {
		// TODO Auto-generated method stub	
		return dao.getAllList();
	}

	public Map<String,Object> getList(SysUserTable entity,Integer page,Integer rows) {
		// TODO Auto-generated method stub
		return dao.getList(entity,page,rows);
	}

	public void add(SysUserTable entity) {
		// TODO Auto-generated method stub
		dao.add(entity);
		
	}

	public void update(SysUserTable entity) {
		// TODO Auto-generated method stub
		dao.update(entity);
	}

	public void delete(SysUserTable entity) {
		// TODO Auto-generated method stub
		dao.delete(entity);
	}
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows){
		return dao.getScopeList(entityList, page, rows);
	};

}

