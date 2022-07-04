package com.eastytuop.builder;

/**
 * @author beck.yang
 * @date 2022/7/2 23:04
 * @description
 */
public class RealBuilderA implements ProductBuilder{
	private Product product = new Product();
	@Override
	public void buildPartA() {
		product.addPart("PartA");
	}

	@Override
	public void buildPartB() {
		product.addPart("PartB");
	}

	@Override
	public Product builder() {
		return this.product;
	}
}
