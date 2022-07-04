package com.eastytuop.template;

/**
 * @author beck.yang
 * @date 2022/7/1 18:11
 * @description
 */
public class Usb2 extends Usb{
	@Override
	public void charge() {
		System.out.println("Usb2.0  充电...");
	}

	@Override
	public void transport() {
		System.out.println("Usb2.0  传输数据...");
	}
}
