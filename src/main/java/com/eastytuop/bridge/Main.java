package com.eastytuop.bridge;

/**
 * @author beck.yang
 * @date 2022/7/11 18:24
 * @description 桥接模式
 */
public class Main {
	public static void main(String[] args) {
		Product productA = new ProductA();
		ConcreteFactory concreteFactory = new ConcreteFactory(productA);
		concreteFactory.producer();
		// 改为生产B
		Product productB = new ProductB();
		concreteFactory.setProduct(productB);
		concreteFactory.producer();
	}
}
