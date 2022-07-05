package com.eastytuop.observer;

/**
 * @author beck.yang
 * @date 2022/7/4 18:28
 * @description 作者B
 */
public class AuthorB extends Author{
	@Override
	public void writeTitle(String title) {
		System.out.println("AuthorB发布文章：" + title);
		notify(title);
	}
}
