package com.eastytuop.singleton;

import java.util.HashSet;
import java.util.Set;

/**
 * @author beck.yang
 * @date 2022/4/25 11:41 AM
 * @description 单例模式-懒汉式（非线程安全）
 */
public class LazySingleton {
	private LazySingleton(){}
	public static LazySingleton lazySingleton;
	public static LazySingleton getInstance(){
		if (lazySingleton == null){
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
}

class LazyMain{
	public static void main(String[] args) throws InterruptedException {
		Set<String> codes = new HashSet<>();
		for (int i = 0; i < 50; i++) {
			Thread thread = new Thread(() -> {
				for (int j = 0; j < 100; j++) {
					LazySingleton instance = LazySingleton.getInstance();
					codes.add(String.valueOf(System.identityHashCode(instance)));
				}
			});
			thread.start();
		}
		Thread.sleep(2000);
		System.out.println(codes.size());
	}
}
