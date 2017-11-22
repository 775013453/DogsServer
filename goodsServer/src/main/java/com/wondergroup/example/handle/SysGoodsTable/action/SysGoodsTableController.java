package com.wondergroup.example.handle.SysGoodsTable.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wondergroup.example.entity.SysGoodsTable;
import com.wondergroup.example.handle.SysGoodsTable.service.SysGoodsTableService;
import com.wondergroup.example.util.JacksonUtil;

/**
  * @ClassName: SysGoodsTableController
  * @Description: (描述)
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */
  
@Controller
@RequestMapping(value="sysGoodsTable")
public class SysGoodsTableController {

	@Autowired
	private SysGoodsTableService service;
	
	@RequestMapping(value="allList")
	@ResponseBody
	public String getAllList() {
		List<SysGoodsTable> list=new ArrayList<SysGoodsTable>();
		Map <String,Object> map =new HashMap<String,Object>();
		list=service.getAllList();
		map.put("total", list.size());
		map.put("rows", list);
		return JacksonUtil.toJson(map).toString();		
	}

	@RequestMapping(value="list")
	@ResponseBody
	public String getList(SysGoodsTable entity,Integer page,Integer rows) {		
		Map <String,Object> map =new HashMap<String,Object>();
		map=service.getList(entity,page,rows);	
		return JacksonUtil.toJson(map).toString();
	}

	@RequestMapping(value="add")
	@ResponseBody
	public Map<String, Object> add(SysGoodsTable entity) {
		service.add(entity);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("flag", "success");
		return map;
	}

	@RequestMapping(value="update")
	@ResponseBody
	public Map<String, Object> update(SysGoodsTable entity) {
		service.update(entity);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("flag", "success");
		return map;
	}

	@RequestMapping(value="delete")
	@ResponseBody
	public Map<String, Object> delete(SysGoodsTable entity) {		
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
