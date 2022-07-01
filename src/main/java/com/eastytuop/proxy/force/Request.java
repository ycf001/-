package com.eastytuop.proxy.force;

/**
 * @author beck.yang
 * @date 2022/6/30 16:57
 * @description 请求类
 */
public abstract class Request {
	public abstract void request();
	public abstract Request getProxy();
}
