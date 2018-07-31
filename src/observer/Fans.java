package observer;

/**
 * 粉丝，关注明星一举一动。
 */
public class Fans implements Observer {
    private Observerable star;

    private String name;

    public Fans(Observerable star,String name) {
        this.name = name;
        this.star = star;
        star.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println(this.name + " love my idol!!");
    }
}
