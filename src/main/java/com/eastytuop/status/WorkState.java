package com.eastytuop.status;

import java.util.Arrays;
import java.util.List;

/**
 * @author beck.yang
 * @date 2022/7/5 11:22
 * @description
 */
public class WorkState extends State{
	private static final List<String> workWeeks = Arrays.asList(
			"周一",
			"周二",
			"周三",
			"周四",
			"周五"
	);

	@Override
	public void handle(Work work) {
		if (workWeeks.contains(work.getWeek())) {
			System.out.println(work.getWeek() + "上班中....");
		}else {
			RestState restState = new RestState();
			restState.handle(work);
		}
	}
}
