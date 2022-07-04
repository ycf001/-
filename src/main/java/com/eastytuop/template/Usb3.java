package com.eastytuop.template;

/**
 * @author beck.yang
 * @date 2022/7/1 18:13
 * @description
 */
public class Usb3 extends Usb{
	@Override
	public void charge() {
		System.out.println("Usb3.0  快速充电...");
	}

	@Override
	public void transport() {
		System.out.println("Usb3.0  快速传输数据...");
	}
}
