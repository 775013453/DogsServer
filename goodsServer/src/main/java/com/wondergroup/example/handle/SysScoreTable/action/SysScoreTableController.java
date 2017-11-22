package com.wondergroup.example.handle.SysScoreTable.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wondergroup.example.entity.SysScoreTable;
import com.wondergroup.example.handle.SysScoreTable.service.SysScoreTableService;
import com.wondergroup.example.util.JacksonUtil;

/**
  * @ClassName: SysScoreTableController
  * @Description: (描述)
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */
  
@Controller
@RequestMapping(value="sysScoreTable")
public class SysScoreTableController {

	@Autowired
	private SysScoreTableService service;
	
	@RequestMapping(value="allList")
	@ResponseBody
	public String getAllList() {
		List<SysScoreTable> list=new ArrayList<SysScoreTable>();
		Map <String,Object> map =new HashMap<String,Object>();
		list=service.getAllList();
		map.put("total", list.size());
		map.put("rows", list);
		return JacksonUtil.toJson(map).toString();		
	}

	@RequestMapping(value="list")
	@ResponseBody
	public String getList(SysScoreTable entity,Integer page,Integer rows) {		
		Map <String,Object> map =new HashMap<String,Object>();
		map=service.getList(entity,page,rows);	
		return JacksonUtil.toJson(map).toString();
	}

	@RequestMapping(value="add")
	@ResponseBody
	public Map<String, Object> add(SysScoreTable entity) {
		service.add(entity);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("flag", "success");
		return map;
	}

	@RequestMapping(value="update")
	@ResponseBody
	public Map<String, Object> update(SysScoreTable entity) {
		service.update(entity);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("flag", "success");
		return map;
	}

	@RequestMapping(value="delete")
	@ResponseBody
	public Map<String, Object> delete(SysScoreTable entity) {		
		service.delete(entity);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("flag", "success");
		return map;
	}
	
	@RequestMapping(value="scopeList")
	@ResponseBody
	public String getScopeList(String entityList,Integer page,Integer rows) {		
		Map <String,Object> map =new HashMap<String,Object>();
		map=service.getScopeList(entityList,page,rows);	
		return JacksonUtil.toJson(map).toString();
	}
}
