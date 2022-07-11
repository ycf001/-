package com.eastytuop.memento;

/**
 * @author beck.yang
 * @date 2022/7/6 11:53
 * @description  备忘录
 */
public class Memento {
	private String content;

	public Memento(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}
