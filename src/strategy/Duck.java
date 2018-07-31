package strategy;

/**
 * 将行为实现类加入到父类中
 * 将具体实现委托给行为实现
 */
public class Duck {
    QuackBehaviour quackBehaviour;

    FlyBehavior flyBehavior;

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

   // public void quack(){}

    public void swim(){}

    public void display(){}

}
