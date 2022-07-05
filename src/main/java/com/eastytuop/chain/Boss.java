package com.eastytuop.chain;

/**
 * @author beck.yang
 * @date 2022/7/5 16:39
 * @description 老板
 */
public class Boss extends Manager{
	public Boss(String name) {
		super(name);
	}

	@Override
	public void checkRequest(Request request) {
		if ("请假".equals(request.getType()) && request.getNumber() <= 10) {
			System.out.println(String.format("%s批准%s%s%d天", name, request.getName(), request.getType(), request.getNumber()));
		} else {
			// 老板需要处理全部
			System.out.println(String.format("%s拒绝%s%s%d天", name, request.getName(), request.getType(), request.getNumber()));
		}
	}
}
