package com.qhy.review.service.impl;

import com.qhy.review.annotation.Bean;
import com.qhy.review.annotation.Di;
import com.qhy.review.dao.UserDao;
import com.qhy.review.service.UserService;

@Bean

public class UserServiceImpl implements UserService {
    @Di
    UserDao userDao;

    @Override
    public void add() {
        System.out.println("userService add.......");
        userDao.add();
    }
}
