package com.eastytuop.decorator;

/**
 * @author beck.yang
 * @date 2022/6/29 17:17
 * @description 装饰模式
 */
public class Main {
	public static void main(String[] args) {
		Person zs = new ZhangSan();
		zs.wear();

		System.out.println("戴个帽子---------------");
		HatDecorator zsWithHat = new HatDecorator(zs);
		zsWithHat.wear();

		System.out.println("穿上鞋子---------------");
		ShoeDecorator zsWithShoe = new ShoeDecorator(zsWithHat);
		zsWithShoe.wear();
	}
}
