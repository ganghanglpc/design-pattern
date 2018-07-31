package decorator;

/**
 * 具体装饰者，包含着被装饰的对象
 * 被装饰对象可以是具体实现类，也可以是另一个装饰者
 */
public class Drumstick extends Refreshments{
    KFCFood kfcFood;

    public Drumstick(KFCFood kfcFood) {
        this.kfcFood = kfcFood;
    }

    @Override
    public String getDes() {
        return kfcFood.getDes() + ",Drumstick";
    }

    @Override
    public double cost() {
        return 10 + kfcFood.cost();
    }
}
