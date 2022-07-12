package com.eastytuop.bridge;

/**
 * @author beck.yang
 * @date 2022/7/11 18:26
 * @description
 */
public class ProductB extends Product{
	@Override
	public void construct() {
		System.out.println("装配产品B...");
	}
}
