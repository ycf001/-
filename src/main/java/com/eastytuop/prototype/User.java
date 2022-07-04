package com.eastytuop.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author beck.yang
 * @date 2022/7/1 10:54
 * @description
 */
public class User implements Cloneable{
	private String name;
	private int age;
	private ArrayList<String> hobbies;

	public User(String name, int age){
		System.out.println("构造方法...");
		this.name = name;
		this.age = age;
		this.hobbies = new ArrayList<>();
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobby) {
		this.hobbies.add(hobby);
	}

	@Override
	protected User clone()  {
		User user = null;
		try {
			user = (User) super.clone();
			// 深拷贝
			this.hobbies = (ArrayList<String>) this.hobbies.clone();
		}catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		return user;
	}
}
