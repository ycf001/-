package com.eastytuop.factory.abstractMethod;

/**
 * @author beck.yang
 * @date 2022/6/28 11:39
 * @description mysql部门实现
 */
public class MysqlDepartment implements IDepartmentDao {
	@Override
	public void createDepartment() {
		System.out.println("Create department in mysql.");
	}

	@Override
	public void deleteDepartment() {
		System.out.println("Delete department in mysql.");
	}
}
