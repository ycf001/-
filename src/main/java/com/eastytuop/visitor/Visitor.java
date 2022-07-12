package com.eastytuop.visitor;

/**
 * @author beck.yang
 * @date 2022/7/12 15:55
 * @description 访问者接口
 */
public interface Visitor {
	void visit(ConcreteElementB element);
	void visit(ConcreteElementA element);
}
