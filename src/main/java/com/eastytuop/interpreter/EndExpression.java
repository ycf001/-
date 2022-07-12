package com.eastytuop.interpreter;

/**
 * @author beck.yang
 * @date 2022/7/12 14:41
 * @description 结束符解释器
 */
public class EndExpression implements Expression {
	private String endStr;

	public EndExpression(String endStr) {
		this.endStr = endStr;
	}

	@Override
	public String interpret(String context) {
		return endStr != null && endStr.equals(context) ?
				null : context;
	}
}
