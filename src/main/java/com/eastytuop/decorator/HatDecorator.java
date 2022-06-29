package com.eastytuop.decorator;

/**
 * @author beck.yang
 * @date 2022/6/29 17:12
 * @description
 */
public class HatDecorator extends PersonDecorator{

	public HatDecorator(Person person) {
		super(person);
	}

	public void wearHat(){
		System.out.println("戴灰色帽子.");
	}

	@Override
	public void wear() {
		super.wear();
		wearHat();
	}
}
