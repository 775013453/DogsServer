package com.wondergroup.example.sales.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wondergroup.example.sales.dao.SalesDao;
import com.wondergroup.example.sales.entity.Sales;

/**
  * @ClassName: salesDaoImpl
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */
@Transactional
@Repository
public class SalesDaoImpl implements SalesDao{

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
	
	protected Session getSession() {
		try{
			return sessionFactory.getCurrentSession();
		}catch(Exception e){
			e.printStackTrace();
			return getSession();
		}
	} 
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Sales> getAllList() {
		StringBuffer hql=new StringBuffer();
		hql.append("from Sales u where 1=1");
		List<Sales> list=new ArrayList<Sales>();			
		Query query = getSession().createQuery(hql.toString());
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
	  * @param Sales
	  * @param page
	  * @param rows
	  * @return
	  * @throws
	  */
	@SuppressWarnings("unchecked")
	@Override
	public Map<String,Object> getList(Sales entity,Integer page,Integer rows) {
		StringBuffer hql=new StringBuffer();
		hql.append("from Sales u where 1=1 ");			
		List<Sales> list=new ArrayList<Sales>();
		Query query = getSession().createQuery(hql.toString());		
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
	  * @param Sales
	  * @throws
	  */
	@Override
	public void add(Sales entity) {
		// TODO Auto-generated method stub
		getSession().save(entity);		
	}

	/**
	  * @Title: update
	  * @Description: 
	  * @author: Ouyang
	  * @date 2017年8月1日 下午2:11:58
	  * @最后修改人: Ouyang
	  * @最后修改时间：2017年8月1日 下午2:11:58
	  * @param Sales
	  * @throws
	  */
	@Override
	public void update(Sales entity) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(entity);
	}

	/**
	  * @Title: delete
	  * @Description: 
	  * @author: Ouyang
	  * @date 2017年8月1日 下午2:11:58
	  * @最后修改人: Ouyang
	  * @最后修改时间：2017年8月1日 下午2:11:58
	  * @param Sales
	  * @throws
	  */
	@Override
	public void delete(Sales entity) {
		// TODO Auto-generated method stub
		getSession().delete(getSession().merge(entity));
	}

	/**
	  * @Title: getScopeList
	  * @Description: 
	  * @author: Ouyang
	  * @date 2017年8月1日 下午2:11:58
	  * @最后修改人: Ouyang
	  * @最后修改时间：2017年8月1日 下午2:11:58
	  * @param salesList
	  * @param page
	  * @param rows
	  * @return
	  * @throws
	  */
	@SuppressWarnings({ "unchecked" })
	@Override
	public Map<String,Object> getScopeList(String entityList,Integer page,Integer rows) {
		StringBuffer hql=new StringBuffer();
		hql.append("from Sales u where 1=1 ");	
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
		List<Sales> list=new ArrayList<Sales>();			
		Query query = getSession().createQuery(hql.toString());
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
