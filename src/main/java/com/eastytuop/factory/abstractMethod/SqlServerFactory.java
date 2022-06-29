package com.eastytuop.factory.abstractMethod;

/**
 * @author beck.yang
 * @date 2022/6/28 11:45
 * @description sqlServer工厂
 */
public class SqlServerFactory implements IFactory{
	@Override
	public <T extends IUserDao> T createUserDao() {
		return (T) new SqlServerUser();
	}

	@Override
	public <T extends IDepartmentDao> T createDepartmentDao() {
		return (T) new SqlServerDepartment();
	}
}
