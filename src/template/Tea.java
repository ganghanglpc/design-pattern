package template;

/**
 * 茶
 * 添加茶
 * 添加柠檬
 */
public class Tea extends Beverage {
    @Override
    void brew() {
        System.out.println("add Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("add lemon");
    }
}
