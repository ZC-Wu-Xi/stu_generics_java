package com.xi.demo08;

import java.util.ArrayList;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/8 14:17
 * @description 上限通配符 类/接口<? extends 实参类型> 只能使用该实参或实参子类
 *      三类的关系：minCat extends Cat extends Animal
 */
public class TestUp {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<MinCat> minCats = new ArrayList<>();

        // cats.addAll(animals); // 报错 该方法中指定上限为Cat类 ArrayList<E>.addAll(Collection<? extends E> c)
        cats.addAll(cats);
        cats.addAll(minCats);

        // showAnimal(animals); // 报错 指定上限为Cat类
        showAnimal(cats);
        showAnimal(minCats);

    }

    /**
     * 泛型上限通配符
     * 传递的集合类型只能是 Cat及其子类
     *  可以安全地从 list 中读取元素，您可以将元素当作 Cat 类型处理。
     *  不能向 list 中添加元素，除了 null。这是因为编译器不知道 list 实际上是什么类型（是 Cat 还是 MinCat），因此无法保证添加的元素是类型安全的。
     * @param list
     */
    public static void showAnimal(ArrayList<? extends Cat> list) {
        // 使用泛型上限通配符不能够填充元素
        // list.add(new Cat()); // 报错
        // list.add(new MinCat()); // 报错
        // list.add(new Animal()); // 报错
        list.add(null);

        for (int i = 0; i < list.size(); i++) {
            Cat cat = list.get(i);
            System.out.println(cat);
        }
    }
}
