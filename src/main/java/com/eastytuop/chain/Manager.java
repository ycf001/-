package com.eastytuop.chain;

/**
 * @author beck.yang
 * @date 2022/7/5 15:51
 * @description
 */
public abstract class Manager {
	protected String name;
	// 上级
	protected  Manager superManager;

	public Manager(String name){
		this.name = name;
	}

	public void setSuperManager(Manager superManager) {
		this.superManager = superManager;
	}

	public abstract void checkRequest(Request request);
}
