package com.eastytuop.visitor;

/**
 * @author beck.yang
 * @date 2022/7/12 16:02
 * @description
 */
public class ConcreteElementA implements Element {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void operation() {
		// do something
		System.out.println("ConcreteElementA do something...");
	}
}
