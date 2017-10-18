package com.wondergroup.example.goods.dao;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.goods.entity.Goods;

/**
  * @ClassName: goodsDao
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface GoodsDao {
	
	public List<Goods> getAllList();
	
	public Map<String,Object> getList(Goods entity,Integer page,Integer rows);
	
	public void add(Goods entity);
	
	public void update(Goods entity);
	
	public void delete(Goods entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
