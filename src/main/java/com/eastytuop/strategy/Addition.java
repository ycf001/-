package com.eastytuop.strategy;

/**
 * @author beck.yang
 * @date 2022/6/29 14:22
 * @description 加法
 */
public class Addition extends Strategy{
	@Override
	double calculate(double numA, double numB) {
		return numA + numB;
	}
}
