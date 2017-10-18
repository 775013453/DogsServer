package com.wondergroup.example.goodsRelatePic.dao;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.goodsRelatePic.entity.GoodsRelatePic;

/**
  * @ClassName: goodsRelatePicDao
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface GoodsRelatePicDao {
	
	public List<GoodsRelatePic> getAllList();
	
	public Map<String,Object> getList(GoodsRelatePic entity,Integer page,Integer rows);
	
	public void add(GoodsRelatePic entity);
	
	public void update(GoodsRelatePic entity);
	
	public void delete(GoodsRelatePic entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
