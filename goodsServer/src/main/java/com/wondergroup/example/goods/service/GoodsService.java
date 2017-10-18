package com.wondergroup.example.goods.service;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.goods.entity.Goods;

/**
  * @ClassName: goodsService
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface GoodsService {
	
	public List<Goods> getAllList();
	
	public Map<String,Object> getList(Goods entity,Integer page,Integer rows);
	
	public void add(Goods entity);
	
	public void update(Goods entity);
	
	public void delete(Goods entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
