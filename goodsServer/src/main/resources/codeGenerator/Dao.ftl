package ${package}.dao;

import java.util.List;
import java.util.Map;

import ${package}.entity.${className};

/**
  * @ClassName: ${className}Dao
  * @Description: Dao接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface ${className}Dao {
	
	public List<${className}> getAllList();
	
	public Map<String,Object> getList(${className} entity,Integer page,Integer rows);
	
	public void add(${className} entity);
	
	public void update(${className} entity);
	
	public void delete(${className} entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
