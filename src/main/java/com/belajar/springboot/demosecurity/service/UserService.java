package com.belajar.springboot.demosecurity.service;

import com.belajar.springboot.demosecurity.entity.User;
import com.belajar.springboot.demosecurity.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	void save(WebUser webUser);

}
