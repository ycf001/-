package com.eastytuop.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author beck.yang
 * @date 2022/7/5 10:27
 * @description 迭代器模式
 */
public class Main {
	public static void main(String[] args) {
		ArrayList students = new ArrayList();
		students.add("张三");
		students.add("李四");
		Iterator iterator = students.iterator();
		while (iterator.hasNext()){
			String student = (String) iterator.next();
			System.out.println(student);
		}
	}
}
