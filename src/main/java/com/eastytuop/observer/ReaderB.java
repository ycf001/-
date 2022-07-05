package com.eastytuop.observer;

public class ReaderB extends Reader{
	@Override
	public void read(String title) {
		System.out.println("ReaderB read " + title);
	}
}