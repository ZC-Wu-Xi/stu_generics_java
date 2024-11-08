package com.xi.demo04;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/7 20:21
 * @description 从泛型类派生子类
 */
public class Test04 {
    public static void main(String[] args) {
        ChildFirst<String> childFirst = new ChildFirst<>();
        childFirst.setValue("abc");
        String value = childFirst.getValue();
        System.out.println("value = " + value);

        ChildSecond childSecond = new ChildSecond();
        childSecond.setValue(100);
        int value1 = childSecond.getValue();
        System.out.println("value1 = " + value1);
    }
}
