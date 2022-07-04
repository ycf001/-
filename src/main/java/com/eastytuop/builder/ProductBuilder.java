package com.eastytuop.builder;

/**
 * @author beck.yang
 * @date 2022/7/2 23:02
 * @description
 */
public interface ProductBuilder {
	void buildPartA();
	void buildPartB();
	Product builder();
}
