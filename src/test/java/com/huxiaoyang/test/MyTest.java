package com.huxiaoyang.test;

import java.text.ParseException;

import com.huxiaoyang.utils.DateUtil;
import com.huxiaoyang.utils.StringUtil;

/**
 * @author H-xy
 *
 * 2020年4月24日
 */
public class MyTest {
	
	public static void main(String[] args) throws ParseException {
		
		boolean empty = StringUtil.isEmpty("");
		boolean empty2 = StringUtil.isEmpty("111");
		System.out.println(empty);
		System.out.println(empty2);
		
		boolean number = StringUtil.isFloat("1.");
		boolean number2 = StringUtil.isFloat("11");
		System.out.println(number);
		System.out.println(number2);
		
		int age = DateUtil.getAge("1997-08-02");
		System.out.println(age);
		
	}

}
