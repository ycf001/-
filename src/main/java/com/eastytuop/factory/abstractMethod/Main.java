package com.eastytuop.factory.abstractMethod;

/**
 * @author beck.yang
 * @date 2022/6/28 11:33
 * @description 抽象工厂模式
 */
public class Main {
	public static void main(String[] args) {
		IFactory factory = new MysqlFactory();
		// 只需修改具体的工厂类，即可实现切换为SqlServer
		// IFactory factory = new SqlServerFactory();
		IUserDao userDao = factory.createUserDao();
		userDao.createUser();
		userDao.deleteUser();
		IDepartmentDao departmentDao = factory.createDepartmentDao();
		departmentDao.createDepartment();
		departmentDao.deleteDepartment();
	}
}
