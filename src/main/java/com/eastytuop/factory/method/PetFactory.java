package com.eastytuop.factory.method;

/**
 * @author beck.yang
 * @date 2022/6/27 19:27
 * @description
 */
public abstract class PetFactory {
	public abstract <T extends Pet> T createPet();
}
