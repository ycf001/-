package com.eastytuop.flyweight;

/**
 * @author beck.yang
 * @date 2022/7/5 19:24
 * @description   享元模式
 */
public class Main {
	public static void main(String[] args) {
		FlyWeightFactory factory = new FlyWeightFactory();
		factory.getFlyWeight("A");
		factory.getFlyWeight("A");
		factory.getFlyWeight("B");
		factory.getFlyWeight("B");

		System.out.println(factory.size());
	}
}
