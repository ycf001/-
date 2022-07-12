package com.eastytuop.combination;

import java.util.List;

/**
 * @author beck.yang
 * @date 2022/7/11 17:19
 * @description 抽象部门
 */
public interface IDepartment {
	default void option(){
		// 业务逻辑
	}
	List<IDepartment> getSubDepartments();

	void add(IDepartment department);

	void remove(IDepartment department);
}
