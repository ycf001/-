package com.eastytuop.interpreter;

/**
 * @author beck.yang
 * @date 2022/7/12 14:30
 * @description 解释器模式
 */
public class Main {
	public static void main(String[] args) {
		String s = "Hi , i miss you .";
		Expression endExpression = new EndExpression(".");
		Expression englishExpression = new EnglishExpression();
		for (String context : s.split(" ")) {
			String end = endExpression.interpret(context);
			if (end == null) {
				break;
			}else {
				System.out.print(englishExpression.interpret(context) + " ");
			}
		}
	}
}
