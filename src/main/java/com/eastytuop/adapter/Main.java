package com.eastytuop.adapter;

/**
 * @author beck.yang
 * @date 2022/7/5 09:48
 * @description 适配器模式
 */
public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone();
		V3 v3 = new Adapter();
		phone.charge(v3);
	}
}
