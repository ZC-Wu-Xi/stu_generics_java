package com.xi.demo08;

import java.util.ArrayList;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/8 14:17
 * @description 下限通配符 类/接口<? super 实参类型> 只能使用该实参或实参父类
 *      三类的关系：minCat extends Cat extends Animal
 */
public class TestDown {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<MinCat> minCats = new ArrayList<>();

        // addAll方法使用的是上限通配符 ArrayList<E>.addAll(Collection<? extends E> c)
//         cats.addAll(animals); // 报错 该方法中指定上限为Cat类 只能add Cat及子类
        cats.addAll(cats);
        cats.addAll(minCats);

        showAnimal(animals);
        showAnimal(cats);
//        showAnimal(minCats); // 报错 指定下限为Cat类

    }

    /**
     * 泛型下限通配符
     * 传递的集合类型只能是 Cat及其父类
     * @param list
     */
    public static void showAnimal(ArrayList<? super Cat> list) {
//        list.add(new Animal()); // 报错 ArrayList<E>.add(E e) 向后兼容，限制上限，可以添加E及子类
        list.add(new Cat());
        list.add(new MinCat());

        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }
    }
}
