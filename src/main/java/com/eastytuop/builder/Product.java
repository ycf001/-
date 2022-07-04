package com.eastytuop.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author beck.yang
 * @date 2022/7/2 22:57
 * @description
 */
public class Product {
	private List<String> parts = new ArrayList<>();

	public void addPart(String part){
		this.parts.add(part);
	}

	public void show(){
		System.out.println("------产品--------");
		System.out.println(parts);
	}
}
