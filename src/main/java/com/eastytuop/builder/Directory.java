package com.eastytuop.builder;

import java.util.Locale;

/**
 * @author beck.yang
 * @date 2022/7/2 23:06
 * @description
 */
public class Directory {

	public void construct(ProductBuilder productBuilder){
		productBuilder.buildPartA();
		productBuilder.buildPartB();
	}
}
