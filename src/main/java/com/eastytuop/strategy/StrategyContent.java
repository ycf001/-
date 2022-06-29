package com.eastytuop.strategy;

/**
 * @author beck.yang
 * @date 2022/6/29 14:24
 * @description 策略封装类
 */
public class StrategyContent {
	private Strategy strategy;
	public StrategyContent(Strategy strategy){
		this.strategy = strategy;
	}

	public double calculate(double numA, double numB){
		return strategy.calculate(numA,numB);
	}
}
