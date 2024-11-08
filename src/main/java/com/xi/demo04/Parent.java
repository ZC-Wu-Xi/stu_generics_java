package com.xi.demo04;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/7 20:19
 * @description 父类 泛型类
 */
public class Parent<E> {
    private E value;

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
