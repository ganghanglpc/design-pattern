package observer;

/**
 * 主题接口
 * 有添加，删除，通知方法。
 */
public interface Observerable { ;
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObersers();
}
