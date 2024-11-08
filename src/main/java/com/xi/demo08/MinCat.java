package com.xi.demo08;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/8 14:19
 * @description
 */
public class MinCat extends Cat {
    public int level;

    public MinCat() {
    }

    public MinCat(String name, int age, int level) {
        super(name, age);
        this.level = level;
    }

    @Override
    public String toString() {
        return "MinCat{" +
                "level=" + level +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
