package com.eastytuop.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author beck.yang
 * @date 2022/6/30 18:53
 * @description 生成动态代理抽象类
 */
public class DynamicProxy<T> {
	public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler proxyHandler){
		return (T) Proxy.newProxyInstance(classLoader, interfaces, proxyHandler);
	}
}
