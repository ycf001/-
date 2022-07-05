package com.eastytuop.face;

/**
 * @author beck.yang
 * @date 2022/7/4 17:26
 * @description 门面模式
 */
public class Main {
	public static void main(String[] args) {
		// 喂宠物-未使用门面模式
		Cat cat = new Cat();
		cat.eat();
		Dog dog = new Dog();
		dog.eat();
		//  喂宠物-使用门面模式
		Pet pet = new Pet();
		pet.eat();
	}
}
