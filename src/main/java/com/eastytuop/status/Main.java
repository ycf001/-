package com.eastytuop.status;

/**
 * @author beck.yang
 * @date 2022/7/5 11:26
 * @description 状态模式
 */
public class Main {
	public static void main(String[] args) {
		State initState = new WorkState();
		Work work = new Work(initState);

		work.setWeek("周三");
		work.work();
		work.setWeek("周四");
		work.work();
		work.setWeek("周六");
		work.work();
		work.setWeek("周日");
		work.work();
	}
}
