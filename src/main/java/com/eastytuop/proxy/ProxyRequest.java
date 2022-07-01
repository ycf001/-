package com.eastytuop.proxy;

/**
 * @author beck.yang
 * @date 2022/6/30 16:58
 * @description 代理类
 */
public class ProxyRequest extends Request{
	private RealRequest realRequest;
	@Override
	public void request() {
		if (realRequest == null) {
			realRequest = new RealRequest();
		}
		System.out.println("Proxy...");
		realRequest.request();
	}
}
