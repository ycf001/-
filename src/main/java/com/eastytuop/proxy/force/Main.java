package com.eastytuop.proxy.force;

/**
 * @author beck.yang
 * @date 2022/6/30 17:11
 * @description  代理模式-强制代理
 */
public class Main {
	public static void main(String[] args) {
		RealRequest realRequest = new RealRequest();
		realRequest.request();
		System.out.println("-----------------------");
		Request proxy = realRequest.getProxy();
		proxy.request();
	}
}
