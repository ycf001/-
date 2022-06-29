package com.eastytuop.factory.method;

/**
 * @author beck.yang
 * @date 2022/6/27 18:29
 * @description 宠物工厂
 */
public class DogFactory extends PetFactory {
	@Override
	public <T extends Pet> T createPet(){
		return (T) new Dog();
	}
}
