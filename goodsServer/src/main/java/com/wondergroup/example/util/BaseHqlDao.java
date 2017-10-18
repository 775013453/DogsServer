
package com.wondergroup.example.util;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseHqlDao {
	protected SessionFactory sessionFactory;	

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		try{
			return sessionFactory.getCurrentSession();
		}catch(Exception e){
			e.printStackTrace();
			return sessionFactory.openSession();
		}
	}
	
	/**
	 * 根据查询SQL与参数列表创建Query对象
	 * @param sql
	 * @param objects
	 * @return
	 */
	public Query createSqlQuery(String sql, Object... objects) {
		Query query = getSession().createSQLQuery(sql);
		if (objects != null) {
			for (int i = 0; i < objects.length; i++) {
				query.setParameter(i, objects[i]);
			}
		}
		return query;
	}
	
	public Query createQuery(String hql, Object... objects) {
		Query query = getSession().createQuery(hql);
		if (objects != null) {
			for (int i = 0; i < objects.length; i++) {
				query.setParameter(i, objects[i]);
			}
		}
		return query;
	}
	
	@SuppressWarnings("rawtypes")
	public List queryList(String hql,Map<String,Object> params){
		return this.createQueryMap(hql, params).list();
	}
	
	@SuppressWarnings("rawtypes")
	public List queryListByPage(String hql,Map<String,Object> params,int page,int size){
		Query query = this.createQueryMap(hql, params);
		query.setFirstResult((page - 1) * size);
		query.setMaxResults(size);
		return query.list();
	}
	
	public Query createQueryMap(String hql, Map<String,Object> params) {
		Query query = getSession().createQuery(hql);
		this.setParameterToQuery(query, params);
		return query;
	}
	
	public <T> void save(T t){
		getSession().save(t);
	}
	
	public <T> void saveOrUpdate(T t){
		getSession().saveOrUpdate(t);
	}
	
	public <T> void delete(T t){
		getSession().delete(t);
	}
	
	 /** 
     * @param query
     * @param params 当前支持普通对象,数组,集合三种类型的参数 
     */  
    protected void setParameterToQuery(Query query,Map<String, Object> params){  
        if (params != null && !params.isEmpty()) {  
            for (String key : params.keySet()) {  
                if(params.get(key) instanceof Object[]){  
                    Object[] objs=(Object[]) params.get(key);  
                    query.setParameterList(key, objs);  
                }else if(params.get(key) instanceof Collection<?>){  
                    Collection<?> collection=(Collection<?>) params.get(key);  
                    query.setParameterList(key, collection);  
                }else if(key.toUpperCase().indexOf("LIKE")>-1){
                	query.setParameter(key, "%"+params.get(key)+"%");
                }else if (key.toUpperCase().indexOf("ARRAY") > -1) {
                	query.setParameterList(key,(Object[]) params.get(key));
				}else{  
					query.setParameter(key, params.get(key));  
                }  
            }  
        }  
    }   
   
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int excuteHql(String hql, final Map params) {
		Query query = this.createQueryMap(hql, params);
		int result = query.executeUpdate();
		return result;
	}
	          
}

