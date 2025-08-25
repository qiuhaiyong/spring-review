package com.qhy.review;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;


public class TestUser {

    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject(){
        // 1.加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 2.获取创建的对象
        User user = (User) context.getBean("user");
        // 3.测试
        user.add();
        logger.info("执行成功了~~");
    }

    @Test
    public void testUserObject2() throws Exception {
        // 反射创建
        Class<?> aClass = Class.forName("com.qhy.review.User");
        User user = (User) aClass.getDeclaredConstructor().newInstance();
        user.add();

    }

    @Test
    public void testUserLifeCycle(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("lifecycle.xml");
        User2 bean = ac.getBean(User2.class);
        System.out.println("生命周期：4、通过IOC容器获取bean并使用");
        ac.close();
    }

    @Test
    public void test(){
        YearMonth start = YearMonth.parse("202402", DateTimeFormatter.ofPattern("yyyyMM"));
        YearMonth end   = YearMonth.parse("202502", DateTimeFormatter.ofPattern("yyyyMM"));

        for (YearMonth ym = start; !ym.isAfter(end); ym = ym.plusMonths(1)) {
            System.out.println(ym.format(DateTimeFormatter.ofPattern("yyyyMM")));
        }
    }
}
