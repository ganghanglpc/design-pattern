package adapter;

/**
 * 要适配者的具体实现类
 */
public class iPhone6s implements iPhone {
    @Override
    public void isIPhone() {
        System.out.println("I'm iPhone");
    }
}
