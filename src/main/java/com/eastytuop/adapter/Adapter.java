package com.eastytuop.adapter;

/**
 * @author beck.yang
 * @date 2022/7/5 09:52
 * @description 电源适配器
 */
public class Adapter extends V3{
	private V220 v220 = new V220();
	@Override
	public void voltage() {
		v220.voltage();
		changeVoltage();
	}

	public void changeVoltage(){
		System.out.println("变压为3v");
	}
}
