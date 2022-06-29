package com.eastytuop.singleton;

import com.eastytuop.singleton.enums.SingletonEnum;

import java.util.HashSet;
import java.util.Set;

/**
 * @author beck.yang
 * @date 2022/6/29 11:42
 * @description
 */
public class EnumMain {
	public static void main(String[] args) throws InterruptedException {
		Set<String> codes = new HashSet<>();
		for (int i = 0; i < 50; i++) {
			Thread thread = new Thread(() -> {
				for (int j = 0; j < 100; j++) {
					codes.add(String.valueOf(System.identityHashCode(SingletonEnum.SINGLETON)));
					SingletonEnum.SINGLETON.doSomething();
				}
			});
			thread.start();
		}
		Thread.sleep(2000);
		System.out.println(codes.size());
	}
}
