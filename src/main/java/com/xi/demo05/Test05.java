package com.xi.demo05;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/7 20:48
 * @description 泛型接口的使用
 */
public class Test05 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        String key = apple.getKey();
        System.out.println("key = " + key);

        System.out.println("----------------------");

        Pair<String, Integer> pair = new Pair<>("count", 100);
        String key1 = pair.getKey();
        System.out.println("key1 = " + key1);
        int value1 = pair.getValue();
        System.out.println("value1 = " + value1);
    }
}
