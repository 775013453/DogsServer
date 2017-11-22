package ${package}.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${package}.dao.${className}Dao;
import ${entityPath}.entity.${className};
import ${package}.service.${className}Service;


/**
  * @ClassName: ${className}ServiceImpl
  * @Description: Service接口类
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */

@Service
public class ${className}ServiceImpl implements ${className}Service{

	@Autowired
	${className}Dao dao;
	
	public List<${className}> getAllList() {
		// TODO Auto-generated method stub	
		return dao.getAllList();
	}

	public Map<String,Object> getList(${className} entity,Integer page,Integer rows) {
		// TODO Auto-generated method stub
		return dao.getList(entity,page,rows);
	}

	public void add(${className} entity) {
		// TODO Auto-generated method stub
		dao.add(entity);
		
	}

	public void update(${className} entity) {
		// TODO Auto-generated method stub
		dao.update(entity);
	}

	public void delete(${className} entity) {
		// TODO Auto-generated method stub
		dao.delete(entity);
	}
	
	public  Map<String,Object> getScopeList(String entityList,Integer page,Integer rows){
		return dao.getScopeList(entityList, page, rows);
	};

}

