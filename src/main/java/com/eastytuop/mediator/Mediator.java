package com.eastytuop.mediator;

/**
 * @author beck.yang
 * @date 2022/7/5 17:37
 * @description 中介者抽象类
 */
public abstract class Mediator {
	public abstract void send(String message, MediatorObject mediatorObject);
}
