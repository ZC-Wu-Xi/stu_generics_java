package com.xi.demo04;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/7 20:19
 * @description 子类也是泛型类，继承泛型类父类
 *      泛型类派生子类，子类也是泛型类，那么子类的泛型标识要和父类一致。
 */
public class ChildFirst<T> extends Parent<T>{
    @Override
    public T getValue() {
        return super.getValue();
    }
}
