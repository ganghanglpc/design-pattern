package factory;

public class PKPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }
}
