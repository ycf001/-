package com.eastytuop.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author beck.yang
 * @date 2022/6/30 17:11
 * @description  代理模式-动态代理
 */
public class Main {
	public static void main(String[] args) {
		Request request = new RealRequest();
		Request proxyRequest = RequestProxy.newProxyInstance(request);
		proxyRequest.request();
	}
}
