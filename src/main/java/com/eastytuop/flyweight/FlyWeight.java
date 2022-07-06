package com.eastytuop.flyweight;

/**
 * @author beck.yang
 * @date 2022/7/5 19:14
 * @description  抽象享元类
 */
public abstract class FlyWeight {
	// 内部状态
	private String innerProperty;
	// 外部状态
	private final String outerProperty;

	public FlyWeight(String outerProperty){
		this.outerProperty = outerProperty;
	}

	public abstract void operation();

	public String getInnerProperty() {
		return innerProperty;
	}

	public void setInnerProperty(String innerProperty) {
		this.innerProperty = innerProperty;
	}
}

