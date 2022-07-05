package com.eastytuop.chain;

/**
 * @author beck.yang
 * @date 2022/7/5 15:51
 * @description 责任链模式
 */
public class Main {
	public static void main(String[] args) {
		DepartmentManager departmentManager = new DepartmentManager("部门经理");
		Director director = new Director("总监");
		Boss boss = new Boss("大老板");
		departmentManager.setSuperManager(director);
		director.setSuperManager(boss);

		Request request = new Request("请假",3,"张三");
		departmentManager.checkRequest(request);

		Request request2 = new Request("请假",4,"张三");
		departmentManager.checkRequest(request2);

		Request request3 = new Request("请假",8,"张三");
		departmentManager.checkRequest(request3);

		Request request4 = new Request("请假",12,"张三");
		departmentManager.checkRequest(request4);
	}
}
