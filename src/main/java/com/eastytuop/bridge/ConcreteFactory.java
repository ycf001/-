package com.eastytuop.bridge;

/**
 * @author beck.yang
 * @date 2022/7/11 18:27
 * @description
 */
public class ConcreteFactory extends Factory{
	public ConcreteFactory(Product product) {
		super(product);
	}

	@Override
	public void producer() {
		System.out.println("ConcreteFactory stat producer...");
		super.producer();
	}

	@Override
	public void setProduct(Product product) {
		super.setProduct(product);
	}
}
