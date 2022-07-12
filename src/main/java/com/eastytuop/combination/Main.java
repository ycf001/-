package com.eastytuop.combination;

/**
 * @author beck.yang
 * @date 2022/7/11 17:11
 * @description 组合模式
 */
public class Main {
	public static void main(String[] args) {
		IDepartment department = new Department("产品部");

		IDepartment department2 = new Department("产品一部");
		department.add(department2);
		IDepartment department3 = new Department("产品二部");
		department.add(department3);

		IDepartment zhangSan= new Employee("张三");
		department2.add(zhangSan);

		IDepartment liSi= new Employee("李四");
		department3.add(liSi);

		System.out.println(department);
	}
}
