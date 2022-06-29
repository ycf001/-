package com.eastytuop.singleton;

/**
 * @author beck.yang
 * @date 2022/4/25 11:41 AM
 * @description 单例模式-饿汉式
 */
public class HungrySingleton {
	private HungrySingleton(){}
	public static HungrySingleton hungrySingleton = new HungrySingleton();
	public static HungrySingleton getInstance(){
		return hungrySingleton;
	}
}

class Main{
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			HungrySingleton instance = HungrySingleton.getInstance();
			System.out.println(System.identityHashCode(instance));
		}
	}
}
