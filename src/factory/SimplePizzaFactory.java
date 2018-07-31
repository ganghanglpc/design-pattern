package factory;

/**
 * 简单披萨工厂
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza(new PizzaIngredientFactory() {
                @Override
                public Dough createDough() {
                    return null;
                }

                @Override
                public Sauce createSauce() {
                    return null;
                }

                @Override
                public Cheese createCheese() {
                    return null;
                }
            });
        }else if(type.equals("veggie")){
            pizza = new PepperoniPizza();
        }else if(type.equals("epperoni")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
