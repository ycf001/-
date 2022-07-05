package com.eastytuop.command;

/**
 * @author beck.yang
 * @date 2022/7/5 15:09
 * @description 具体命令A
 */
public class CommandA extends Command{
	private Receiver receiver;
	public CommandA(Receiver receiver){
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		this.receiver.executeCommand();
	}
}
