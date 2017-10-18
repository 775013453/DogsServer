package com.wondergroup.example.picture.dao;

import java.util.List;
import java.util.Map;

import com.wondergroup.example.picture.entity.Picture;

/**
  * @ClassName: pictureDao
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface PictureDao {
	
	public List<Picture> getAllList();
	
	public Map<String,Object> getList(Picture entity,Integer page,Integer rows);
	
	public void add(Picture entity);
	
	public void update(Picture entity);
	
	public void delete(Picture entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
