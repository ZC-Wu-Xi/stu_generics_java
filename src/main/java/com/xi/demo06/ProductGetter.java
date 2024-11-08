package com.xi.demo06;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/7 19:55
 * @description 模拟公司抽奖 使用泛型方法
 */
public class ProductGetter<T> {
    Random random = new Random();

    // 奖品
    private T product;

    // 奖品池
    ArrayList<T> list = new ArrayList<>();

    /**
     * 添加奖品
     * @param t
     */
    public void addProduct(T t) {
        list.add(t);
    }

    /**
     * 抽奖
     * @return
     */
    public T getProduct() {
        product = list.get(random.nextInt(list.size()));
        return product;
    }

    /**
     * 定义泛型方法 泛型方法能使方法独立于类而产生变化
     * @param list 参数
     * @param <T> 泛型标识，具体类型，由调用方法的时候来指定
     * @return
     */
    public <T> T getProduct(ArrayList<T> list) {
        return list.get(random.nextInt(list.size()));
    }


    /**
     * 静态的泛型方法，采用多个泛型类型
     */
    public static <T, E, K> void printType(T t, E e, K k) {
        System.out.println(t + "\t" + t.getClass().getSimpleName());
        System.out.println(e + "\t" + e.getClass().getSimpleName());
        System.out.println(k + "\t" + k.getClass().getSimpleName());
    }

    /**
     * 泛型可变参数的定义
     */
    public static <E> void print(E... e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i] + "\t" + e[i].getClass().getSimpleName());
        }
    }
}
