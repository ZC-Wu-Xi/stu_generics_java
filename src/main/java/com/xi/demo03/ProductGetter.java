package com.xi.demo03;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/7 19:55
 * @description 模拟公司抽奖
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

}
