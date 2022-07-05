package com.eastytuop.command;

/**
 * @author beck.yang
 * @date 2022/7/5 15:12
 * @description 命令执行者B
 */
public class ReceiverB extends Receiver{

	@Override
	public void executeCommand() {
		System.out.println("ReceiverB do something...");
	}
}
