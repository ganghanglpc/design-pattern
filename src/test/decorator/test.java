package test.decorator;

import decorator.Drumstick;
import decorator.FrenchFries;
import decorator.KFCFood;
import decorator.Setmeal;

public class test {
    public static void main(String args[]){
        KFCFood setmeal = new Setmeal();
        KFCFood frenchfries = new FrenchFries(setmeal);
        KFCFood drumstcik = new Drumstick(frenchfries);
        System.out.println(drumstcik.cost());
        System.out.println(drumstcik.getDes());
    }
}
