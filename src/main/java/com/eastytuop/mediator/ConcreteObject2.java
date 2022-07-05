package com.eastytuop.mediator;

/**
 * @author beck.yang
 * @date 2022/7/5 17:39
 * @description 具体对象2
 */
public class ConcreteObject2 extends MediatorObject{
	public ConcreteObject2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String message) {
		super.mediator.send(message, this);
	}

	public void notify(String message){
		System.out.println("ConcreteObject2 receive message: "+message);
	}
}
