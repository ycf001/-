package com.eastytuop.adapter;

/**
 * @author beck.yang
 * @date 2022/7/5 09:59
 * @description 手机类（调用适配器类）
 */
public class Phone {
	public void charge(V3 v3){
		v3.voltage();
		System.out.println("充电中...电压: 3v");
	}
}
