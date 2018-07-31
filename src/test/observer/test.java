package test.observer;

import observer.Fans;
import observer.Observer;
import observer.Observerable;
import observer.Star;

public class test {
    public static void main(String args[]){
        Observerable star = new Star();
        Observer fans1 = new Fans(star,"Xiaohong");
        Observer fans2 = new Fans(star,"Xiaoming");
        Observer fans3 = new Fans(star,"Xiaolan");
        star.notifyAllObersers();


        star.removeObserver(fans3);
        star.removeObserver(fans2);
        star.notifyAllObersers();
    }
}
