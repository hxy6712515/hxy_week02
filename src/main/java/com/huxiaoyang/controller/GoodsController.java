package com.huxiaoyang.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huxiaoyang.beans.Goods;
import com.huxiaoyang.service.GoodsService;

/**
 * @author H-xy
 *
 * 2020年4月24日
 */
@Controller
public class GoodsController {
	
	@Resource
	private GoodsService gService;
	
	@RequestMapping("queryAll")
	public String list(Model model, 
			@RequestParam(defaultValue="1")Integer pageNum,
			Integer startPrice,
			Integer endPrice,
			Integer startSales,
			Integer endSales,
			String column,
			String orders
			){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startPrice", startPrice);
		map.put("endPrice", endPrice);
		map.put("startSales", startSales);
		map.put("endSales", endSales);
		map.put("column", column);
		map.put("orders", orders);

		List<Goods> list = gService.queryAll(map);
		PageHelper.startPage(pageNum, 5);
		PageInfo<Goods> page = new PageInfo<>(list);
		
		model.addAttribute("page", page);
		
		return "list";
	}

}
