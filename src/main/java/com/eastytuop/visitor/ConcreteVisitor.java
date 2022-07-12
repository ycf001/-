package com.eastytuop.visitor;

/**
 * @author beck.yang
 * @date 2022/7/12 15:58
 * @description 具体访问者
 */
public class ConcreteVisitor implements Visitor{
	@Override
	public void visit(ConcreteElementB element) {
		element.operation();
	}

	@Override
	public void visit(ConcreteElementA element) {
		element.operation();
	}
}
