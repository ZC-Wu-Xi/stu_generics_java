package com.xi.demo10;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/8 18:01
 * @description 泛型数组
 *      在开发过程中尽量不要使用泛型数组，在实际开发中使用泛型集合代替泛型数组
 *      因为泛型数组在运行时类型擦除，无法确定泛型类型，所以无法进行类型检查
 */
public class Test10 {
    public static void main(String[] args) {
//        ArrayList<String>[] listArr = new ArrayList<>[5]; // 报错
        /*
        // 使用数组时不要把原生数组暴露出来
        ArrayList[] lists = new ArrayList[5];
        ArrayList<String>[] listArr = lists;
        */
        ArrayList<String>[] listArr = new ArrayList[5];

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(100);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("abc");

        listArr[0] = strList;

//        listArr[0] = intList; // 报错
//        lists[0] = intList;
        String s = listArr[0].get(0);
        System.out.println(s);

        System.out.println("-------------------------");

        Fruit<String> fruit = new Fruit<>(String.class, 3);
        fruit.put(0, "苹果");
        fruit.put(1, "香蕉");
        fruit.put(2, "橘子");
        System.out.println(Arrays.toString(fruit.getArrays()));
        System.out.println(fruit.get(2));
    }
}
