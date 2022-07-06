package com.eastytuop.flyweight;

/**
 * @author beck.yang
 * @date 2022/7/5 19:17
 * @description 具体享元类（不支持共享）
 */
public class UnSharedConcreteFlyWeight extends FlyWeight{

	public UnSharedConcreteFlyWeight(String outerProperty) {
		super(outerProperty);
	}

	@Override
	public void operation() {
		System.out.println("ConcreteFlyWeight operation...");
	}
}
