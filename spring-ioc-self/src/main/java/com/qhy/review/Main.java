package com.qhy.review;

import com.qhy.review.bean.AnnotationApplicationContext;
import com.qhy.review.bean.ApplicationContext;
import com.qhy.review.service.UserService;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationApplicationContext("com.qhy.review");
        UserService userService = (UserService) applicationContext.getBean(UserService.class);
        userService.add();
    }
}