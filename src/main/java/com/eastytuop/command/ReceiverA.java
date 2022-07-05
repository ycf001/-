package com.eastytuop.command;

/**
 * @author beck.yang
 * @date 2022/7/5 15:12
 * @description 命令执行者A
 */
public class ReceiverA extends Receiver{

	@Override
	public void executeCommand() {
		System.out.println("ReceiverA do something...");
	}
}
