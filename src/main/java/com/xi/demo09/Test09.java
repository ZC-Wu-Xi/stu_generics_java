package com.xi.demo09;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/8 16:54
 * @description 泛型擦除
 *      泛型信息只存在于代码编译阶段，在进入JVM之前，与泛型相关的信息会被擦除掉，我们称之为--类型擦除。
 */
public class Test09 {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();

        System.out.println(intList.getClass().getSimpleName()); // ArrayList
        System.out.println(strList.getClass().getSimpleName()); // ArrayList

        System.out.println(intList.getClass() == strList.getClass()); // true
        */

        Erasure<Integer> erasure = new Erasure<>();
        // 利用反射，返回Erasure类的字节码文件的Class类对象
        Class<? extends Erasure> clz = erasure.getClass();
        // 获取所有的成员变量
        Field[] declaredFields = clz.getDeclaredFields(); // 获取所有字段
        // 遍历所有成员变量
        for (Field declaredField : declaredFields) {
            // 打印成员变量的名称和类型
            System.out.println(declaredField.getName() + ":" + declaredField.getType().getSimpleName()); // class Erasure<T> 时：key:Object； class Erasure<T extends Number>时：key:Number
        }

        System.out.println("-------------------------");

        // 获取所有的成员方法
        Method[] declaredMethods = clz.getDeclaredMethods();
        // 遍历所有成员方法
        for (Method declaredMethod : declaredMethods) {
            // 打印成员方法的名称和返回值类型
            System.out.println(declaredMethod.getName() + ":" + declaredMethod.getReturnType().getSimpleName());
            /*
                getKey:Number
                setKey:void
                show:List
             */
        }

        System.out.println("-------------------------");

        // 拿到InfoImpl的字节码文件
        Class<InfoImpl> infoClass = InfoImpl.class;
        // 获取所有的成员方法
        Method[] infoImplMethods = infoClass.getDeclaredMethods();
        // 遍历所有成员方法
        for (Method method : infoImplMethods) {
            // 打印成员方法的名称和返回值类型
            System.out.println(method.getName() + ":" + method.getReturnType().getSimpleName());
        }
    }
}
