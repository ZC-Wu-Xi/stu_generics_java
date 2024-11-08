package com.xi.demo07;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/8 13:52
 * @description 类型通配符
 */
public class Test07 {
    public static void main(String[] args) {
        Box<Number> box1 = new Box<>();
        box1.setFirst(100);
        showBox(box1);

        Box<Integer> box2 = new Box<>(); // Integer extends Number
        box2.setFirst(200);
        showBox(box2);
    }

    // 使用类型通配符
//    public static void showBox(Box<?> box) {
//        Object first = box.getFirst();
//        System.out.println("first = " + first);
//    }

    // 使用类型通配符指定上限，泛型可以是Number及Number的子类
    public static void showBox(Box<? extends Number> box) {
        Number first = box.getFirst();
        System.out.println("first = " + first);
    }
/*
    public static void showBox(Box<Number> box) {
        Number first = box.getFirst();
        System.out.println("first = " + first);
    }

    public static void showBox(Box<Integer> box) {
        Number first = box.getFirst();
        System.out.println("first = " + first);
    }
    */
}
