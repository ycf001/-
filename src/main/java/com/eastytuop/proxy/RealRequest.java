package com.eastytuop.proxy;

/**
 * @author beck.yang
 * @date 2022/6/30 16:57
 * @description 真实请求类
 */
public class RealRequest extends Request{
	@Override
	public void request() {
		System.out.println("Request...");
	}
}
