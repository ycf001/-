package com.eastytuop.factory.abstractMethod;

import java.lang.reflect.Method;

/**
 * @author beck.yang
 * @date 2022/7/7 16:14
 * @description
 */
public class TestReflect {
	public static void main(String[] args) throws Exception {
		Method animalMethod = Animal.class.getDeclaredMethod("print");
		Method catMethod = Cat.class.getDeclaredMethod("print");

		Cat cat = new Cat();
		animalMethod.invoke(cat);

		catMethod.invoke(cat);
	}

}
