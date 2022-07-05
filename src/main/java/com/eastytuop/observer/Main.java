package com.eastytuop.observer;

/**
 * @author beck.yang
 * @date 2022/7/4 18:20
 * @description 观察者模式
 */
public class Main {
	public static void main(String[] args) {
		Reader readerA = new ReaderA();
		Reader readerB = new ReaderB();

		Author authorA = new AuthorA();
		authorA.addReader(readerA);
		authorA.addReader(readerB);
		authorA.writeTitle("AuthorA's new title...");

		Author authorB = new AuthorB();
		authorB.addReader(readerA);
		authorB.addReader(readerB);
		authorB.writeTitle("AuthorB's new title...");

	}
}
