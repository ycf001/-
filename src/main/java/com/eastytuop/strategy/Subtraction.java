package com.eastytuop.strategy;

/**
 * @author beck.yang
 * @date 2022/6/29 14:23
 * @description 减法
 */
public class Subtraction extends Strategy {
	@Override
	double calculate(double numA, double numB) {
		return numA - numB;
	}
}
