package com.eastytuop.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author beck.yang
 * @date 2022/7/11 17:11
 * @description 具体部门
 */
public class Department implements IDepartment {
	private String name;

	public Department(String name) {
		this.name = name;
	}

	@Override
	public void option() {
		// 业务逻辑
	}

	@Override
	public List<IDepartment> getSubDepartments() {
		return subDepartments;
	}

	private List<IDepartment> subDepartments = new ArrayList<>();

	@Override
	public void add(IDepartment department) {
		subDepartments.add(department);
	}

	@Override
	public void remove(IDepartment department) {
		subDepartments.remove(department);
	}

	@Override
	public String toString() {
		return "Department{" +
				"name='" + name + '\'' +
				", subDepartments=" + subDepartments +
				'}';
	}
}
