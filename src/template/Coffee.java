package template;

/**
 * 咖啡
 * 添加咖啡
 * 添加牛奶和糖
 */
public class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("drip coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("add milk and sugar");
    }
}
