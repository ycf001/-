package com.eastytuop.factory.abstractMethod;

public class Cat implements Animal {
	@Override
	public <T extends Animal> T print() {
		return (T) new Cat();
	}
}