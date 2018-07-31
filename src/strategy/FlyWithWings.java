package strategy;

/**
 * 具体的会飞行为
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("I believe I can fly!");
    }
}
