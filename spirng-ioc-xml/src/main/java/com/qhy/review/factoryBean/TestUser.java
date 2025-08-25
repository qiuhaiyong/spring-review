package com.qhy.review.factoryBean;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class TestUser {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("factoryBean.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);

    }
}
