package com.xi.demo08;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/8 14:19
 * @description
 */
public class Animal {
    public String name;

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }
}
