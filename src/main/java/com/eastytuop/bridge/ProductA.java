package com.eastytuop.bridge;

/**
 * @author beck.yang
 * @date 2022/7/11 18:25
 * @description
 */
public class ProductA extends Product{
	@Override
	public void construct() {
		System.out.println("装配产品A...");
	}
}
