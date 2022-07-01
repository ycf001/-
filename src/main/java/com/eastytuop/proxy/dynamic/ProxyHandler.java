package com.eastytuop.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author beck.yang
 * @date 2022/6/30 18:23
 * @description 代理处理类
 */
public class ProxyHandler implements InvocationHandler {
	Object obj;

	public ProxyHandler(Object obj){
		this.obj = obj;
	}

	public void before(){
		System.out.println("Before request...");
	}

	public void after(){
		System.out.println("After request...");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object result = method.invoke(this.obj, args);
		after();
		return result;
	}
}
