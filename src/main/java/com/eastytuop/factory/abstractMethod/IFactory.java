package com.eastytuop.factory.abstractMethod;

/**
 * @author beck.yang
 * @date 2022/6/28 11:38
 * @description 抽象工厂接口
 */
public interface IFactory {
	<T extends IUserDao> T createUserDao();

	<T extends IDepartmentDao> T createDepartmentDao();
}
