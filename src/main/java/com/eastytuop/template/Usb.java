package com.eastytuop.template;

/**
 * @author beck.yang
 * @date 2022/7/1 18:09
 * @description
 */
public abstract class Usb {
	public abstract void charge();
	public abstract void transport();
	public void link(){
		charge();
		transport();
	}
}
