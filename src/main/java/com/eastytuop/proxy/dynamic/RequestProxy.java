package com.eastytuop.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author beck.yang
 * @date 2022/6/30 19:01
 * @description 具体对象动态代理生成类
 */
public class RequestProxy extends DynamicProxy<RealRequest>{
	public static Request newProxyInstance(Request request){
		ClassLoader classLoader = request.getClass().getClassLoader();
		Class<?>[] interfaces = request.getClass().getInterfaces();
		InvocationHandler proxyHandler = new ProxyHandler(request);
		return newProxyInstance(classLoader,interfaces,proxyHandler);
	}
}
