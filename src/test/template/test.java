package test.template;

import template.Beverage;
import template.Coffee;
import template.Tea;

public class test {
    public static void main(String args[]){
        Beverage tea = new Tea();
        tea.prepareRecipe();

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
