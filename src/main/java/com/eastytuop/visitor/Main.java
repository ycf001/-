package com.eastytuop.visitor;

/**
 * @author beck.yang
 * @date 2022/7/12 15:54
 * @description 访问者模式
 */
public class Main {
	public static void main(String[] args) {
		Visitor visitor = new ConcreteVisitor();
		ConcreteElementA concreteElementA = new ConcreteElementA();
		concreteElementA.accept(visitor);

		ConcreteElementB concreteElementB = new ConcreteElementB();
		concreteElementB.accept(visitor);
	}
}
