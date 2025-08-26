package com.qhy.review;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

        // 1.指定有参构造创建对象
//        Constructor c1 = clazz.getConstructor(String.class, int.class, String.class);
//        Car car1 = (Car) c1.newInstance("benz", 20, "blue");
//        System.out.println(car1);

        Constructor c2 = clazz.getDeclaredConstructor(String.class, int.class, String.class);
        c2.setAccessible(true);
        Car car2 = (Car) c2.newInstance("benz", 20, "blue");
        System.out.println(car2);
    }
    // 3.获取属性
    @Test
    public void test03() throws Exception{
        Class clazz = Car.class;
        Car car = (Car) clazz.getDeclaredConstructor().newInstance();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(car, "宝马");
            }
            System.out.println(field.getName());
        }
        System.out.println(car);

    }

    // 4.获取方法
    @Test
    public void test04() throws Exception{
        Class clazz = new Car().getClass();
        Car car = (Car) clazz.getDeclaredConstructor().newInstance();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if(method.getName().equals("run")){
                method.setAccessible(true);
                method.invoke(car);
            }
            System.out.println(method.getName());
        }
    }
}
