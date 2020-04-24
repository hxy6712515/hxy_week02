package com.huxiaoyang.service;

import java.util.List;
import java.util.Map;

import com.huxiaoyang.beans.Goods;

/**
 * @author H-xy
 *
 * 2020年4月24日
 */
public interface GoodsService {
	
	public List<Goods> queryAll(Map<String, Object> map);


}
