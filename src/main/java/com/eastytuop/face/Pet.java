package com.eastytuop.face;

/**
 * @author beck.yang
 * @date 2022/7/4 17:29
 * @description
 */
public class Pet {
	private Cat cat = new Cat();
	private Dog dog = new Dog();

	public void eat(){
		cat.eat();
		dog.eat();
	}
}
