package com.eastytuop.observer;

/**
 * @author beck.yang
 * @date 2022/7/4 18:28
 * @description 作者A
 */
public class AuthorA extends Author{

	@Override
	public void writeTitle(String title) {
		System.out.println("AuthorA发布文章：" + title);
		notify(title);
	}
}
