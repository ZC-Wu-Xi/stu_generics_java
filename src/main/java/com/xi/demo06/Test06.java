package com.xi.demo06;

import java.util.ArrayList;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/8 11:18
 * @description 模拟公司抽奖 使用泛型方法
 *      泛型方法能使方法独立于类而产生变化
 */
public class Test06 {
    public static void main(String[] args) {
        ProductGetter<Integer> productGetter = new ProductGetter<>();
        // 使用非泛型方法只能抽取和泛型类同一个泛型的物品
        int[] products = {100, 200, 400};
        for (int i = 0; i < products.length; i++) {
            productGetter.addProduct(products[i]);
        }
        // 泛型类成员方法的调用
        int product = productGetter.getProduct();
        System.out.println("product = " + product);

        System.out.println("-------------------------");


        // 使用泛型方法，可以抽取不同于泛型类的泛型类型的物品
        ArrayList<String> strList = new ArrayList<>();
        strList.add("笔记本电脑");
        strList.add("手机");
        strList.add("扫地机器人");
        // 泛型方法的调用，类型是通过调用方法的时候来指定的
        String product1 = productGetter.getProduct(strList);
        System.out.println(product1 + "\t" + product1.getClass().getSimpleName()); // 手机	String

        System.out.println("-------------------------");

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1000);
        intList.add(3000);
        intList.add(5000);
        intList.add(10000);
        Integer product2 = productGetter.getProduct(intList);
        System.out.println(product2 + "\t" + product2.getClass().getSimpleName()); // 手机	String

        System.out.println("-------------------------");

        // 调用多个类型的泛型方法
        ProductGetter.printType(100, "java", true);

        System.out.println("-------------------------");

        // 可变参数的泛型方法调用
        ProductGetter.print(1, 2, 3);
        ProductGetter.print(1, 2, "a", "b");
    }
}
