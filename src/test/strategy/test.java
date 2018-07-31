package test.strategy;

import strategy.FlyBehavior;
import strategy.MallardDuck;

public class test {
    public static void main(String args[]){
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }

}

