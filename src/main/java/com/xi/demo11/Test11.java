package com.xi.demo11;

import java.lang.reflect.Constructor;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/8 19:37
 * @description
 */
public class Test11 {
    public static void main(String[] args) throws Exception {
        /*
        // 获取Person字节码文件
        Class personClass = Person.class;
        // 获取构造函数
        Constructor constructor = personClass.getConstructor();
        // 创建对象
        Person person = (Person) constructor.newInstance();
        */

        // 获取Person字节码文件
        Class<Person> personClass = Person.class;
        // 获取构造函数
        Constructor<Person> constructor = personClass.getConstructor();
        // 创建对象
        Person person = constructor.newInstance();
    }
}
