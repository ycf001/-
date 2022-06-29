package com.eastytuop.factory.method;

/**
 * @author beck.yang
 * @date 2022/6/27 18:40
 * @description 工厂方法模式
 */
public class Main {
	public static void main(String[] args) {
		PetFactory catFactory = new CatFactory();
		Pet cat = catFactory.createPet();
		cat.eat();
		PetFactory dogFactory = new DogFactory();
		Pet dog = dogFactory.createPet();
		dog.eat();
	}
}
