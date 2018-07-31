package decorator;

/**
 * 具体装饰者，包含着被装饰的对象
 * 被装饰对象可以是具体实现类，也可以是另一个装饰者
 */
public class FrenchFries extends Refreshments {
    KFCFood kfcFood;

    public FrenchFries(KFCFood kfcFood) {
        this.kfcFood = kfcFood;
    }

    @Override
    public String getDes() {
        return kfcFood.getDes() + ",French fries";
    }

    @Override
    public double cost() {
        return 5 + kfcFood.cost();
    }
}
