package com.qhy.review;

public class User {
    public void add (){
        System.out.println("add..............");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }

    public User() {
        System.out.println("0：无参数构造方法执行..........");
    }
}
