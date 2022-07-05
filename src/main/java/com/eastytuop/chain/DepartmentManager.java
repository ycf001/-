package com.eastytuop.chain;

/**
 * @author beck.yang
 * @date 2022/7/5 16:31
 * @description 部门经理
 */
public class DepartmentManager extends Manager {
	public DepartmentManager(String name) {
		super(name);
	}

	@Override
	public void checkRequest(Request request) {
		if ("请假".equals(request.getType()) && request.getNumber() <= 3) {
			System.out.println(String.format("%s批准%s%s%d天", name, request.getName(), request.getType(), request.getNumber()));
		} else {
			if (superManager != null) {
				superManager.checkRequest(request);
			}
		}
	}
}
