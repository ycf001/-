package com.eastytuop.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author beck.yang
 * @date 2022/7/12 14:38
 * @description 英语解释器
 */
public class EnglishExpression implements Expression {
	private static Map<String, String> expressionMap = new HashMap<>();

	static {
		expressionMap.put("hi", "你好");
		expressionMap.put("hello", "哈喽");
		expressionMap.put("i", "我");
		expressionMap.put("miss", "想");
		expressionMap.put("you", "你");
	}

	@Override
	public String interpret(String context) {
		String s = expressionMap.get(context.toLowerCase());
		return s == null ? context : s;
	}
}
