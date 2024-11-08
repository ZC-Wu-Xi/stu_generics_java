package com.xi.demo05;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/7 20:49
 * @description 实现类泛型类 实现泛型接口
 *      泛型接口的实现类，是一个泛型类，那么要保证实现接口的泛型类泛型标识包含泛型接口的泛型标识
 */
public class Pair<T, E> implements Generator<T> {
    private T key;
    private E value;

    public Pair(T key, E value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public T getKey() {
        return key;
    }

    public E getValue() {
        return value;
    }
}
