package com.xi.demo05;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/7 20:44
 * @description 实现类非泛型类 实现泛型接口
 *      实现泛型接口的类，不是泛型类，需要明确实现泛型接口的数据类型。
 */
public class Apple implements Generator<String> {
    @Override
    public String getKey() {
        return "hello generic";
    }
}
