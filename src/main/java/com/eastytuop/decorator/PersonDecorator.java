package com.eastytuop.decorator;

/**
 * @author beck.yang
 * @date 2022/6/29 17:08
 * @description 人类装饰类
 */
public class PersonDecorator extends Person{
	private Person person;

	public PersonDecorator(Person person){
		this.person = person;
	}

	@Override
	public void wear() {
		this.person.wear();
	}
}
