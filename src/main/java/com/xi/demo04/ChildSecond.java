package com.xi.demo04;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/7 20:19
 * @description 子类也是泛型类，继承泛型类父类
 *      泛型类派生子类，子类不是泛型类，父类要明确泛型的数据类型
 */
public class ChildSecond extends Parent<Integer>{
    @Override
    public Integer getValue() {
        return super.getValue();
    }
}
