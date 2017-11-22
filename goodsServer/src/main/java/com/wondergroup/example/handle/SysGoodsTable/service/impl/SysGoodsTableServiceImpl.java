package com.wondergroup.example.handle.SysGoodsTable.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wondergroup.example.handle.SysGoodsTable.dao.SysGoodsTableDao;
import com.wondergroup.example.entity.SysGoodsTable;
import com.wondergroup.example.handle.SysGoodsTable.service.SysGoodsTableService;


/**
  * @ClassName: SysGoodsTableServiceImpl
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

@Service
public class SysGoodsTableServiceImpl implements SysGoodsTableService{

	@Autowired
	SysGoodsTableDao dao;
	
	public List<SysGoodsTable> getAllList() {
		// TODO Auto-generated method stub	
		return dao.getAllList();
	}

	public Map<String,Object> getList(SysGoodsTable entity,Integer page,Integer rows) {
		// TODO Auto-generated method stub
		return dao.getList(entity,page,rows);
	}

	public void add(SysGoodsTable entity) {
		// TODO Auto-generated method stub
		dao.add(entity);
		
	}

	public void update(SysGoodsTable entity) {
		// TODO Auto-generated method stub
		dao.update(entity);
	}

	public void delete(SysGoodsTable entity) {
		// TODO Auto-generated method stub
		dao.delete(entity);
	}
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows){
		return dao.getScopeList(entityList, page, rows);
	};

}

