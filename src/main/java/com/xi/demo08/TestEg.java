package com.xi.demo08;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/8 15:03
 * @description
 */
public class TestEg {
    public static void main(String[] args) {
        // TreeSet(Comparator<? super E> comparator) 创建TreeSet集合时指定比较器 下限通配符，只能是实参及实参的父类
//        TreeSet<Cat> treeSet = new TreeSet<>(new Comparator1()); // 根据Animal的name比较 返回值只能是Animal及其子类
        TreeSet<Cat> treeSet = new TreeSet<>(new Comparator2()); // 根据Cat的age比较 返回值只能是Cat及其子类
//         TreeSet<Cat> treeSet = new TreeSet<>(new Comparator3()); // 报错 返回值只能是MinCat及其子类 Comparator3 implements Comparator<MinCat>
//        TreeSet<MinCat> treeSet = new TreeSet<>(new Comparator3()); // 根据MinCat的level比较 Comparator3
        treeSet.add(new Cat("jerry", 3));
        treeSet.add(new Cat("amy", 4));
        treeSet.add(new Cat("frank", 5));
        treeSet.add(new Cat("jim", 2));
//        treeSet.add(new MinCat("a", 1, 2));
//        treeSet.add(new MinCat("b", 3, 4));
//        treeSet.add(new MinCat("c", 2, 1));

        for (Cat cat : treeSet) {
            System.out.println(cat);
        }
    }
}


class Comparator1 implements Comparator<Animal> {

    // 根据animal的name比较
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.name.compareTo(o2.name);
    }
}

class Comparator2 implements Comparator<Cat> {
    // 根据cat的age比较
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.age - o2.age;
    }
}

class Comparator3 implements Comparator<MinCat> {
    // 根据mincat的level比较
    @Override
    public int compare(MinCat o1, MinCat o2) {
        return o1.level - o2.level;
    }
}


