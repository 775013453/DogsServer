package ${package}.service;

import java.util.List;
import java.util.Map;

import ${entityPath}.entity.${className};

/**
  * @ClassName: ${className}Service
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

public interface ${className}Service {
	
	public List<${className}> getAllList();
	
	public Map<String,Object> getList(${className} entity,Integer page,Integer rows);
	
	public void add(${className} entity);
	
	public void update(${className} entity);
	
	public void delete(${className} entity);
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows);

}
