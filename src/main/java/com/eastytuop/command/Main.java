package com.eastytuop.command;

/**
 * @author beck.yang
 * @date 2022/7/5 15:05
 * @description 命令模式
 */
public class Main {
	public static void main(String[] args) {
		Receiver receiverA = new ReceiverA();
		Command commandA = new CommandA(receiverA);
		Invoker invokerA = new Invoker(commandA);
		invokerA.invoke();

		Receiver receiverB = new ReceiverB();
		Command commandB = new CommandB(receiverB);
		Invoker invokerB = new Invoker(commandB);
		invokerB.invoke();
	}
}
