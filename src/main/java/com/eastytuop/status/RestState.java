package com.eastytuop.status;

/**
 * @author beck.yang
 * @date 2022/7/5 11:22
 * @description
 */
public class RestState extends State{
	@Override
	public void handle(Work work) {
		System.out.println(work.getWeek() + "休息中...");
	}
}
