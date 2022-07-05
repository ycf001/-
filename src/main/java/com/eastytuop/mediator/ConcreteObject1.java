package com.eastytuop.mediator;

/**
 * @author beck.yang
 * @date 2022/7/5 17:39
 * @description 具体对象1
 */
public class ConcreteObject1 extends MediatorObject{
	public ConcreteObject1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String message) {
		super.mediator.send(message, this);
	}

	public void notify(String message){
		System.out.println("ConcreteObject1 receive message: "+message);
	}
}
