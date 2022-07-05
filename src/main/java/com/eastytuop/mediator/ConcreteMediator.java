package com.eastytuop.mediator;

/**
 * @author beck.yang
 * @date 2022/7/5 17:38
 * @description 具体中介者
 */
public class ConcreteMediator extends Mediator{
	private ConcreteObject1 concreteObject1;
	private ConcreteObject2 concreteObject2;



	public void setConcreteObject1(ConcreteObject1 concreteObject1) {
		this.concreteObject1 = concreteObject1;
	}

	public void setConcreteObject2(ConcreteObject2 concreteObject2) {
		this.concreteObject2 = concreteObject2;
	}

	@Override
	public void send(String message, MediatorObject mediatorObject) {
		if (mediatorObject.equals(this.concreteObject1)) {
			this.concreteObject2.notify(message);
		}else{
			this.concreteObject1.notify(message);
		}
	}
}
