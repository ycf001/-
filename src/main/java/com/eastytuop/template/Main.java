package com.eastytuop.template;

/**
 * @author beck.yang
 * @date 2022/7/1 18:14
 * @description 模版方法模式
 */
public class Main {
	public static void main(String[] args) {
		Usb usb2 = new Usb2();
		usb2.link();
		Usb usb3 = new Usb3();
		usb3.link();
	}
}
