package strategy;

/**
 * 绿头鸭
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        //外观是绿头鸭
        System.out.println("I'm a real mallard duck");
    }
}
