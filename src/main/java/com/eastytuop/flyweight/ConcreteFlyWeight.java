package com.eastytuop.flyweight;

/**
 * @author beck.yang
 * @date 2022/7/5 19:17
 * @description 具体享元类
 */
public class ConcreteFlyWeight extends FlyWeight{

	public ConcreteFlyWeight(String outerProperty) {
		super(outerProperty);
	}

	@Override
	public void operation() {
		System.out.println("ConcreteFlyWeight operation...");
	}
}
