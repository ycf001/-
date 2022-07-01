package com.eastytuop.proxy.force;

/**
 * @author beck.yang
 * @date 2022/6/30 16:58
 * @description 代理类
 */
public class ProxyRequest extends Request {
	private Request request;
	public ProxyRequest(Request request){
		this.request = request;
	}

	@Override
	public void request() {
		System.out.println("Proxy...");
		request.request();
	}

	@Override
	public Request getProxy() {
		return this;
	}
}
