package com.eastytuop.singleton;

import java.util.HashSet;
import java.util.Set;

/**
 * @author beck.yang
 * @date 2022/4/25 11:41 AM
 * @description 单例模式-懒汉式（线程安全-静态内部类）
 */
public class InnerSafeLazySingleton {
	private InnerSafeLazySingleton(){}
	private static class InnerSafeLazySingletonHolder{
		private static final InnerSafeLazySingleton INNER_SAFE_LAZY_SINGLETON = new InnerSafeLazySingleton();
	}
	public static InnerSafeLazySingleton getInstance(){
		return InnerSafeLazySingletonHolder.INNER_SAFE_LAZY_SINGLETON;
	}
}

class InnerSafeLazyMain{
	public static void main(String[] args) throws InterruptedException {
		Set<String> codes = new HashSet<>();
		for (int i = 0; i < 50; i++) {
			Thread thread = new Thread(() -> {
				for (int j = 0; j < 100; j++) {
					InnerSafeLazySingleton instance = InnerSafeLazySingleton.getInstance();
					codes.add(String.valueOf(System.identityHashCode(instance)));
				}
			});
			thread.start();
		}
		Thread.sleep(2000);
		System.out.println(codes.size());
	}
}
