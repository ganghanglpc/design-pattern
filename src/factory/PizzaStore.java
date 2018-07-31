package factory;

/**
 * 披萨店，提供预定披萨的做法
 */
public abstract class PizzaStore {
//    private SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
//        Pizza pizza = pizzaFactory.createPizza(type);
//        if(type.equals("cheese")){
//            pizza = new CheesePizza();
//        }else if(type.equals("pepperoni")){
//            pizza = new PepperoniPizza();
//        }else if(type.equals("veggie")){
//            pizza = new VeggiePizza();
//        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
    //其他方法
}
