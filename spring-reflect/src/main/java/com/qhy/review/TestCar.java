package com.qhy.review;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
@SuppressWarnings("all")
public class TestCar {
    // 1.获取Class对象的多种方式
    @Test
    public void test01() throws Exception {
        // 1 类名.class
        Class clazz1 = Car.class;
        // 2 对象.getClass()
        Class clazz2 = new Car().getClass();
        // 3 Class.forName("全路径")
        Class clazz3 = Class.forName("com.qhy.review.Car");

        Car car = (Car) clazz3.getDeclaredConstructor().newInstance();
        System.out.println(car);
    }
    // 2.获取构造方法
    @Test
    public void test02() throws Exception{
        Class clazz = Class.forName("com.qhy.review.Car");
        // 获取所有构
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("方法名称：" + constructor.getName() + " " + "参数个数：" +  constructor.getParameterCount());
        }
    }
    // 3.获取属性

    // 4.获取方法

}
