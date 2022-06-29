package com.eastytuop.factory.simple;

/**
 * @author beck.yang
 * @date 2022/6/27 18:29
 * @description 宠物工厂
 */
public class PetFactory{
	public static <T extends Pet> T createPet(Class<T> clazz){
		Pet pet = null;
		try {
			pet= (Pet) Class.forName(clazz.getName()).getDeclaredConstructor().newInstance();
		}catch (Exception e){
			System.out.println("Pet生成错误!");
			e.printStackTrace();
		}
		return (T) pet;
	}
}
