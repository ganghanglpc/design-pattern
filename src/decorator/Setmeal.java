package decorator;

/**
 * 套餐
 */
public class Setmeal extends KFCFood{
    private Hamberger hamberger;
    private Cola cola;

    public Setmeal() {
        des = "a kind of cheap set meal";
    }

    @Override
    public double cost() {
        return 15;
    }
}
