package factory;

/**
 * 北京的披萨店
 */
public class PekingPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza(new PKPizzaIngredientFactory());
       }else if(type.equals("pepperoni")){
           pizza = new PepperoniPizza();
       }else if(type.equals("veggie")){
           pizza = new VeggiePizza();
        }
        return pizza;
    }
}
