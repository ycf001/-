package com.eastytuop.chain;

/**
 * @author beck.yang
 * @date 2022/7/5 16:26
 * @description
 */
public class Request {
	private String type;
	private int number;
	private String name;

	public Request(String type, int number, String name) {
		this.type = type;
		this.number = number;
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}
}
