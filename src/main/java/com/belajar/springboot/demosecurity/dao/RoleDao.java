package com.belajar.springboot.demosecurity.dao;

import com.belajar.springboot.demosecurity.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
