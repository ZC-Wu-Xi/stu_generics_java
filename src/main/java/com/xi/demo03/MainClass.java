package com.xi.demo03;

/**
 * @author ZC_Wu 汐
 * @date 2024/11/7 19:54
 * @description 泛型类型在逻辑上可以看成是多个不同的类型，但实际上都是相同类型
 *          模拟公司年终抽奖  双奖池：实物奖池<String> 和 现金奖池<Integer>
 *
 */
public class MainClass {
    public static void main(String[] args) {
        // 物品奖池
        ProductGetter<String> itemProductGetter = new ProductGetter<>();
        // 物品奖品
        String[] itemProducts = {"苹果手机", "华为手机", "扫地机器人", "咖啡机"};
        // 将物品奖品添加到物品奖池
        for (int i = 0; i < itemProducts.length; i++) {
            itemProductGetter.addProduct(itemProducts[i]);
        }
        // 抽取物品
        String itemProduct = itemProductGetter.getProduct();
        System.out.printf("实物奖池：\n  恭喜您，抽中了%s\n", itemProduct);

        System.out.println("------------------------");

        // 现金奖池
        ProductGetter<Integer> moneyProductGetter = new ProductGetter<>();
        // 现金奖品金额
        int[] moneyProducts = {5000, 10000, 30000, 50000, 100000};
        // 将现金奖品添加到现金奖池
        for (int i = 0; i < moneyProducts.length; i++) {
            moneyProductGetter.addProduct(moneyProducts[i]);
        }
        // 抽取现金
        int moneyProduct = moneyProductGetter.getProduct();
        System.out.printf("现金奖池：\n  恭喜你抽中 %s￥ 现金大奖", moneyProduct);
    }
}
