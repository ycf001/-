package com.eastytuop.proxy.dynamic;

/**
 * @author beck.yang
 * @date 2022/6/30 16:57
 * @description 真实请求类
 */
public class RealRequest implements Request {
	@Override
	public void request() {
		System.out.println("Request...");
	}
}
