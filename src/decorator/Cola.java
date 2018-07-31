package decorator;

/**
 * 可乐
 */
public class Cola extends KFCFood {
    public Cola() {
        des = "I'm a cup of cola";
    }

    @Override
    public double cost() {
        return 5;
    }
}
