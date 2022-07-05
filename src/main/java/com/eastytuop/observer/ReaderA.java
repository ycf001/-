package com.eastytuop.observer;

/**
 * @author beck.yang
 * @date 2022/7/4 18:36
 * @description
 */
public class ReaderA extends Reader{
	@Override
	public void read(String title) {
		System.out.println("ReaderA read " + title);
	}
}
