package com.belajar.springboot.demosecurity.dao;

import com.belajar.springboot.demosecurity.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User theUser);
}
