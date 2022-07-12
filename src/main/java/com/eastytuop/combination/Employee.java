package com.eastytuop.combination;

import java.util.List;

/**
 * @author beck.yang
 * @date 2022/7/11 17:17
 * @description 具体员工
 */
public class Employee implements IDepartment{
	private String name;

	public Employee(String name){
		this.name = name;
	}

	@Override
	public List<IDepartment> getSubDepartments() {
		// 透明方式，Leaf不需要实现
		return null;
	}

	@Override
	public void add(IDepartment department) {
		// 透明方式，Leaf不需要实现
	}

	@Override
	public void remove(IDepartment department) {
		// 透明方式，Leaf不需要实现
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				'}';
	}
}
