package decorator;

/**
 * 汉堡
 */
public class Hamberger extends KFCFood{

    public Hamberger(){
        des = "I'm a hamberger";
    }
    @Override
    public double cost() {
        return 10;
    }
}
