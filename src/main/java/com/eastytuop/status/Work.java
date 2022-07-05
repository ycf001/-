package com.eastytuop.status;

/**
 * @author beck.yang
 * @date 2022/7/5 11:17
 * @description 工作类
 */
public class Work {
	private State state;
	private String week;

	public Work(State state){
		this.state = state;
	}

	public void work(){
		this.state.handle(this);
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}
}
