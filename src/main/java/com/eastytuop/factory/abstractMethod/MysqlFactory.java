package com.eastytuop.factory.abstractMethod;

/**
 * @author beck.yang
 * @date 2022/6/28 11:44
 * @description mysql工厂类
 */
public class MysqlFactory implements IFactory {
	@Override
	public <T extends IUserDao> T createUserDao() {
		return (T) new MysqlUser();
	}

	@Override
	public <T extends IDepartmentDao> T createDepartmentDao() {
		return (T) new MysqlDepartment();
	}
}
