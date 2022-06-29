package com.eastytuop.factory.simple;

/**
 * @author beck.yang
 * @date 2022/6/27 18:40
 * @description 简单工厂模式
 */
public class Main {
	public static void main(String[] args) {
		Pet cat = PetFactory.createPet(Cat.class);
		cat.eat();
		Pet dog = PetFactory.createPet(Dog.class);
		dog.eat();
	}
}
