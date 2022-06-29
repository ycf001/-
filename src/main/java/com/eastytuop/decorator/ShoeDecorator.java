package com.eastytuop.decorator;

/**
 * @author beck.yang
 * @date 2022/6/29 17:12
 * @description
 */
public class ShoeDecorator extends PersonDecorator{

	public ShoeDecorator(Person person) {
		super(person);
	}

	public void wearShoe(){
		System.out.println("穿红色鞋子.");
	}

	@Override
	public void wear() {
		super.wear();
		wearShoe();
	}
}
