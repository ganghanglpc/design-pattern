package decorator;

public abstract class KFCFood {
    public String des = "我是KFC里所有食物（包括饮料）的父类";

    public String getDes() {
        return des;
    }

    public abstract double cost();
}
