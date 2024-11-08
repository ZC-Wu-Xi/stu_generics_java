package com.xi.demo10;

import java.lang.reflect.Array;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/8 18:16
 * @description
 */
public class Fruit<T> {
    private T[] arrays;

    public Fruit(Class<T> clz, int length) {
        // 通过Array.newInstance创建泛型数组
        arrays = (T[])Array.newInstance(clz, length);
    }

    /**
     * 填充数组
     * @param index
     * @param item
     */
    public void put(int index, T item) {
        arrays[index] = item;
    }

    /**
     * 获取数组中的元素
     * @param index
     * @return
     */
    public T get(int index) {
        return arrays[index];
    }

    public T[] getArrays() {
        return arrays;
    }
}
