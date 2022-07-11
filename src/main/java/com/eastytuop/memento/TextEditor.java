package com.eastytuop.memento;

/**
 * @author beck.yang
 * @date 2022/7/6 11:47
 * @description 文本编辑器
 */
public class TextEditor {
	private String content;

	public Memento createMemento(){
		return new Memento(content);
	}

	public void revertMemento(Memento memento){
		this.content = memento.getContent();
	}

	public void show(){
		System.out.println(this.content);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
