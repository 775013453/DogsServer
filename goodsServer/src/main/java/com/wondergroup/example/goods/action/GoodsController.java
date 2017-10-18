package com.wondergroup.example.goods.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wondergroup.example.goods.entity.Goods;
import com.wondergroup.example.goods.service.GoodsService;
import com.wondergroup.example.util.JacksonUtil;

/**
  * @ClassName: goodsController
  * @Description: (描述)
  * @author Ouyang
  * @date 2017年8月1日 下午2:11:58
  * @最后修改人 Ouyang
  * @最后修改时间 2017年8月1日 下午2:11:58
  */
  
@Controller
@RequestMapping(value="goods")
public class GoodsController {

	@Autowired
	private GoodsService service;
	
	@RequestMapping(value="allList")
	@ResponseBody
	public String getAllList() {
		List<Goods> list=new ArrayList<Goods>();
		Map <String,Object> map =new HashMap<String,Object>();
		list=service.getAllList();
		map.put("total", list.size());
		map.put("rows", list);
		return JacksonUtil.toJson(map).toString();		
	}

	@RequestMapping(value="list")
	@ResponseBody
	public String getList(Goods entity,Integer page,Integer rows) {		
		Map <String,Object> map =new HashMap<String,Object>();
		map=service.getList(entity,page,rows);	
		return JacksonUtil.toJson(map).toString();
	}

	@RequestMapping(value="add")
	@ResponseBody
	public Map<String, Object> add(Goods entity) {
		service.add(entity);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("flag", "success");
		return map;
	}

	@RequestMapping(value="update")
	@ResponseBody
	public Map<String, Object> update(Goods entity) {
		service.update(entity);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("flag", "success");
		return map;
	}

	@RequestMapping(value="delete")
	@ResponseBody
	public Map<String, Object> delete(Goods entity) {		
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
