package com.xi.demo08;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/8 14:19
 * @description
 */
public class Cat extends Animal{
    public int age;

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }
}
