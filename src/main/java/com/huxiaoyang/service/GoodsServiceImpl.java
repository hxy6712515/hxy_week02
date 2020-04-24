package com.huxiaoyang.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huxiaoyang.beans.Goods;
import com.huxiaoyang.mapper.GoodsMapper;

/**
 * @author H-xy
 *
 * 2020年4月24日
 */
@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Resource
	private GoodsMapper gMapper;

	@Override
	public List<Goods> queryAll(Map<String, Object> map) {
		return gMapper.queryAll(map);
	}

}
