package com.eastytuop.memento;

/**
 * @author beck.yang
 * @date 2022/7/6 11:46
 * @description 备忘录模式
 */
public class Main {
	public static void main(String[] args) {
		// 初始化
		TextEditor textEditor = new TextEditor();
		textEditor.setContent("");
		Memento init = textEditor.createMemento();
		textEditor.show();
		// 编辑
		textEditor.setContent("这里是编辑的一段话...");
		Memento edit1 = textEditor.createMemento();
		textEditor.show();
		// 撤销编辑
		textEditor.revertMemento(init);
		textEditor.show();
		// 取消撤销
		textEditor.revertMemento(edit1);
		textEditor.show();
	}
}
