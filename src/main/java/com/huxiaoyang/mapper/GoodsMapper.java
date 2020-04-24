package com.huxiaoyang.mapper;

import java.util.List;
import java.util.Map;

import com.huxiaoyang.beans.Goods;

/**
 * @author H-xy
 *
 * 2020年4月24日
 */
public interface GoodsMapper {
	
	public void insertGoods(Goods goods);
	
	public List<Goods> queryAll(Map<String, Object> map);

}
