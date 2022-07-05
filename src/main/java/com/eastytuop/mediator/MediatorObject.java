package com.eastytuop.mediator;

/**
 * @author beck.yang
 * @date 2022/7/5 17:38
 * @description 对象
 */
public abstract class MediatorObject {
	protected Mediator mediator;

	public MediatorObject(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void send(String message);
}
