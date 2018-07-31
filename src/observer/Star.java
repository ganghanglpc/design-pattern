package observer;

import java.util.ArrayList;

/**
 * 明星，一旦有风吹草动，粉丝立刻知晓。
 */
public class Star implements Observerable {
    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObersers() {
        for(Observer o : observers){
            o.update();
        }
    }
}
