package com.eastytuop.factory.abstractMethod;

/**
 * @author beck.yang
 * @date 2022/6/28 11:39
 * @description
 */
public class SqlServerUser implements IUserDao {
	@Override
	public void createUser() {
		System.out.println("Create user in sqlServer.");
	}

	@Override
	public void deleteUser() {
		System.out.println("Delete user in sqlServer.");
	}
}
