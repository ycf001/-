package com.eastytuop.factory.abstractMethod;

/**
 * @author beck.yang
 * @date 2022/6/28 11:40
 * @description sqlServer部门实现
 */
public class SqlServerDepartment implements IDepartmentDao {
	@Override
	public void createDepartment() {
		System.out.println("Create department in sqlServer.");
	}

	@Override
	public void deleteDepartment() {
		System.out.println("Delete department in sqlServer.");
	}
}
