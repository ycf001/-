package com.eastytuop.command;

/**
 * @author beck.yang
 * @date 2022/7/5 15:17
 * @description
 */
public class Invoker {
	private Command command;

	public Invoker(Command command){
		this.command = command;
	}

	public void invoke(){
		this.command.execute();
	}
}
