package factory;

/**
 * 上海披萨店
 */
public class ShanghaiPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory pizzaIngredientFactory = new SHPizzaIngredientFactory();
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
        }
        return pizza;
    }
}
