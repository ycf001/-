package com.eastytuop.strategy;

/**
 * @author beck.yang
 * @date 2022/6/29 14:26
 * @description 策略模式
 */
public class Main {
	public static void main(String[] args) {
		StrategyContent additionStrategy = new StrategyContent(new Addition());
		StrategyContent subtractionStrategy = new StrategyContent(new Subtraction());
		double addResult = additionStrategy.calculate(3.1D, 1.1D);
		System.out.println(addResult);
		double subResult = subtractionStrategy.calculate(3.1D, 1.1D);
		System.out.println(subResult);
	}
}
