package com.eastytuop.builder;

/**
 * @author beck.yang
 * @date 2022/7/2 22:56
 * @description  建造者模式
 */
public class Main {
	public static void main(String[] args) {
		Directory directory = new Directory();
		ProductBuilder builderA = new RealBuilderA();
		directory.construct(builderA);
		Product builder = builderA.builder();
		builder.show();

		ProductBuilder builderB = new RealBuilderB();
		directory.construct(builderB);
		Product builder2 = builderB.builder();
		builder2.show();
	}
}
