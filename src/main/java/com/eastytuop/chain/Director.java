package com.eastytuop.chain;

/**
 * @author beck.yang
 * @date 2022/7/5 16:31
 * @description 总监
 */
public class Director extends Manager {
	public Director(String name) {
		super(name);
	}

	@Override
	public void checkRequest(Request request) {
		if ("请假".equals(request.getType()) && request.getNumber() <= 5) {
			System.out.println(String.format("%s批准%s%s%d天", name, request.getName(), request.getType(), request.getNumber()));
		} else {
			if (superManager != null) {
				superManager.checkRequest(request);
			}
		}
	}
}
