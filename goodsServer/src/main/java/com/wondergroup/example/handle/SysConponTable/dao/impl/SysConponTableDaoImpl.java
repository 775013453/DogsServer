package com.wondergroup.example.handle.SysConponTable.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wondergroup.example.entity.SysConponTable;
import com.wondergroup.example.handle.SysConponTable.dao.SysConponTableDao;

/**
  * @ClassName: SysConponTableDaoImpl
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

@Repository
public class SysConponTableDaoImpl implements SysConponTableDao{

	/**
	  * @Title: getAllList
	  * @Description: 
	  * @author: Ouyang
	  * @date 2017年8月1日 下午2:11:58
	  * @最后修改人: Ouyang
	  * @最后修改时间：2017年8月1日 下午2:11:58
	  * @return
	  * @throws
	  */
	@Autowired  
	protected SessionFactory sessionFactory;	
	  
	@SuppressWarnings("unchecked")
	public List<SysConponTable> getAllList() {
		StringBuffer hql=new StringBuffer();
		hql.append("from SysConponTable u where 1=1");
		List<SysConponTable> list=new ArrayList<SysConponTable>();			
		Query query = sessionFactory.openSession().createQuery(hql.toString());
		list=query.list();
		return list;
	}

	/**
	  * @Title: getList
	  * @Description: 
	  * @author: Ouyang
	  * @date 2017年8月1日 下午2:11:58
	  * @最后修改人: Ouyang
	  * @最后修改时间：2017年8月1日 下午2:11:58
	  * @param SysConponTable
	  * @param page
	  * @param rows
	  * @return
	  * @throws
	  */
	@SuppressWarnings("unchecked")
	public Map<String,Object> getList(SysConponTable entity,Integer page,Integer rows) {
		StringBuffer hql=new StringBuffer();
		hql.append("from SysConponTable u where 1=1 ");			
		List<SysConponTable> list=new ArrayList<SysConponTable>();
		Query query = sessionFactory.openSession().createQuery(hql.toString());		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("total",query.list().size());		
		if(page!=null&&rows!=null){
			int firstResult=rows*(page-1);
			int maxResult=rows;
			query.setFirstResult(firstResult);
			query.setMaxResults(maxResult);
		}
		list=query.list();
		map.put("rows", list);		
		return map;
	}

	/**
	  * @Title: add
	  * @Description: 
	  * @author: Ouyang
	  * @date 2017年8月1日 下午2:11:58
	  * @最后修改人: Ouyang
	  * @最后修改时间：2017年8月1日 下午2:11:58
	  * @param SysConponTable
	  * @throws
	  */
	public void add(SysConponTable entity) {
		// TODO Auto-generated method stub
		sessionFactory.openSession().save(entity);		
	}

	/**
	  * @Title: update
	  * @Description: 
	  * @author: Ouyang
	  * @date 2017年8月1日 下午2:11:58
	  * @最后修改人: Ouyang
	  * @最后修改时间：2017年8月1日 下午2:11:58
	  * @param SysConponTable
	  * @throws
	  */
	public void update(SysConponTable entity) {
		// TODO Auto-generated method stub
		sessionFactory.openSession().saveOrUpdate(entity);
	}

	/**
	  * @Title: delete
	  * @Description: 
	  * @author: Ouyang
	  * @date 2017年8月1日 下午2:11:58
	  * @最后修改人: Ouyang
	  * @最后修改时间：2017年8月1日 下午2:11:58
	  * @param SysConponTable
	  * @throws
	  */
	public void delete(SysConponTable entity) {
		// TODO Auto-generated method stub
		sessionFactory.openSession().delete(entity);
	}

	/**
	  * @Title: getScopeList
	  * @Description: 
	  * @author: Ouyang
	  * @date 2017年8月1日 下午2:11:58
	  * @最后修改人: Ouyang
	  * @最后修改时间：2017年8月1日 下午2:11:58
	  * @param SysConponTableList
	  * @param page
	  * @param rows
	  * @return
	  * @throws
	  */
	@SuppressWarnings({ "unchecked" })
	public Map<String,Object> getScopeList(String entityList,Integer page,Integer rows) {
		StringBuffer hql=new StringBuffer();
		hql.append("from SysConponTable u where 1=1 ");	
		Map<String,Object> map=new HashMap<String,Object>();
		if(entityList!=null){
			hql.append("and u.entityBm in (:bms)");
			List<String> sList = new ArrayList<String>();
			for(int i=0;i<entityList.split(",").length;i++){
				sList.add(entityList.split(",")[i]);
			}
			map.put("bms",sList);
		}else{
			hql.append("and 1<>1");
		}		
		List<SysConponTable> list=new ArrayList<SysConponTable>();			
		Query query = sessionFactory.openSession().createQuery(hql.toString());
		Map<String,Object> map1=new HashMap<String,Object>();
		map1.put("total",query.list().size());
		if(page!=null&& rows!=null){
			int firstResult=rows*(page-1);
			int maxResult=rows;
			query.setFirstResult(firstResult);
			query.setMaxResults(maxResult);
		}
		list=query.list();		
		map1.put("rows", list);		
		return map1;
	}
}
