package com.xi.demo09;

import java.util.List;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/8 17:11
 * @description 泛型擦除
 */
//public class Erasure<T> {
public class Erasure<T extends Number> {
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    /**
     * 泛型方法
     * @return
     * @param <T>
     */
    public <T extends List> T show(T t) {
        return t;
    }
}
