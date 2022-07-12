package com.eastytuop.visitor;

/**
 * @author beck.yang
 * @date 2022/7/12 15:57
 * @description 被访问元素接口
 */
public interface Element {
	void accept(Visitor visitor);
	void operation();
}
