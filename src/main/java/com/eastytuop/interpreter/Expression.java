package com.eastytuop.interpreter;

/**
 * @author beck.yang
 * @date 2022/7/12 14:32
 * @description 解释器接口
 */
public interface Expression {
	String interpret(String context);
}
