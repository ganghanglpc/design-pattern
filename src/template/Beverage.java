package template;

/**
 * 模板方法，定义了具体的步骤，但是详细的实现交由子类来完成
 */
public abstract class Beverage {
    public final void prepareRecipe(){
        boilWater();
        brew(); //交由子类实现
        pourInCup();
        addCondiments(); //;交由子类实现
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
