package singleton;

/**
 * 最经典的单例
 */
public class Singleton {
    //静态私有变量，定义唯一实例（自身）
    private static Singleton instance;

    //饿汉模式或者静态代码块
    //private static Singleton instance = new Singleton();
    static {
        instance = new Singleton();
    };
    //必须是私有的构造器
    private Singleton(){}
    //对外暴露的访问点
    public Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    // synchronized关键字
    public synchronized Singleton getInstance1(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    //DCL检查机制
    public static Singleton getInstance3() {
        //断点1
        if (instance == null) {
            //断点2
            synchronized (Singleton.class) {
                //断点3
                if (instance == null) {
                    //断点4
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
