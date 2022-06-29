package com.eastytuop.singleton;

import java.util.HashSet;
import java.util.Set;

/**
 * @author beck.yang
 * @date 2022/4/25 11:41 AM
 * @description 单例模式-懒汉式（线程安全）
 */
public class SafeLazySingleton {
	private SafeLazySingleton(){}
	public static SafeLazySingleton safeLazySingleton;
	public static SafeLazySingleton getInstance(){
		if (safeLazySingleton == null){
			synchronized (SafeLazySingleton.class){
				if (safeLazySingleton == null) {
					safeLazySingleton = new SafeLazySingleton();
				}
			}
		}
		return safeLazySingleton;
	}
}

class SafeLazyMain{
	public static void main(String[] args) throws InterruptedException {
		Set<String> codes = new HashSet<>();
		for (int i = 0; i < 50; i++) {
			Thread thread = new Thread(() -> {
				for (int j = 0; j < 100; j++) {
					SafeLazySingleton instance = SafeLazySingleton.getInstance();
					codes.add(String.valueOf(System.identityHashCode(instance)));
				}
			});
			thread.start();
		}
		Thread.sleep(2000);
		System.out.println(codes.size());
	}
}
