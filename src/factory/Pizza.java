package factory;

/**
 * 披萨接口，提供了准备原料，烘焙，裁剪，打包方法
 */
public abstract class Pizza {
    private String name;
    private double price;
    public Dough dough;
    public Sauce sauce;
    public Cheese cheese;

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();

}
