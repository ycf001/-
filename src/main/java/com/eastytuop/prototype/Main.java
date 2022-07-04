package com.eastytuop.prototype;

/**
 * @author beck.yang
 * @date 2022/7/1 10:54
 * @description 原型模式
 */
public class Main {
	public static void main(String[] args) {
		User user = new User("张三", 20);
		user.setHobbies("写代码");
		System.out.println(user.getHobbies());
		User clone = user.clone();
		clone.setHobbies("设计模式");
		System.out.println(clone.getHobbies());
		System.out.println(user.getHobbies());
	}
}
