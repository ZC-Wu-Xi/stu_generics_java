package com.xi.demo07;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/8 13:51
 * @description 类型通配符
 */
public class Box<E> {
    private E first;

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }
}
