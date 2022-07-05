package com.eastytuop.status;

/**
 * @author beck.yang
 * @date 2022/7/5 11:18
 * @description
 */
public abstract class State {
	public abstract void handle(Work work);
}
