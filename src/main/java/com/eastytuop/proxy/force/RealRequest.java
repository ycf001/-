package com.eastytuop.proxy.force;

/**
 * @author beck.yang
 * @date 2022/6/30 16:57
 * @description 真实请求类
 */
public class RealRequest extends Request {
	private Request proxy = null;
	@Override
	public void request() {
		if (this.proxy == null) {
			System.out.println("请使用代理...");
		}else {
			System.out.println("Request...");
		}
	}

	@Override
	public Request getProxy() {
		if (this.proxy == null){
			this.proxy = new ProxyRequest(this);
		}
		return this.proxy;
	}


}
