package com.eastytuop.factory.abstractMethod;

/**
 * @author beck.yang
 * @date 2022/6/28 11:38
 * @description
 */
public class MysqlUser implements IUserDao {
	@Override
	public void createUser() {
		System.out.println("Create user in mysql.");
	}

	@Override
	public void deleteUser() {
		System.out.println("Delete user in mysql.");
	}
}
