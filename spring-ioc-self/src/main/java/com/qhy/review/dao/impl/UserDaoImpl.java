package com.qhy.review.dao.impl;

import com.qhy.review.annotation.Bean;
import com.qhy.review.dao.UserDao;

@Bean
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("userDao add.......");
    }
}
