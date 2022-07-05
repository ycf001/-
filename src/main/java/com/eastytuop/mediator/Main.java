package com.eastytuop.mediator;

/**
 * @author beck.yang
 * @date 2022/7/5 17:13
 * @description 中介者模式
 */
public class Main {
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		ConcreteObject1 concreteObject1 = new ConcreteObject1(mediator);
		ConcreteObject2 concreteObject2 = new ConcreteObject2(mediator);
		mediator.setConcreteObject1(concreteObject1);
		mediator.setConcreteObject2(concreteObject2);

		concreteObject1.send("hello");
		concreteObject2.send("哈喽");
	}
}
