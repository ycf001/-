package com.eastytuop.builder;

/**
 * @author beck.yang
 * @date 2022/7/2 23:04
 * @description
 */
public class RealBuilderB implements ProductBuilder{
	private Product product = new Product();
	@Override
	public void buildPartA() {
		product.addPart("Part1");
	}

	@Override
	public void buildPartB() {
		product.addPart("Part2");
	}

	@Override
	public Product builder() {
		return this.product;
	}
}
