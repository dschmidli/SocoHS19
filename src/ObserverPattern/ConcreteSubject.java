package ObserverPattern;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {

    private ArrayList<Observer> observers;
    private double googlePrice;

    public ConcreteSubject() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void subscribe(Observer aObserver) {
        observers.add(aObserver);
    }

    @Override
    public void unsubscribe(Observer aObserver) {
        int observerIndex = observers.indexOf(aObserver);
        System.out.println("Observer " + (observerIndex+1) + " deleted.");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(googlePrice);
        }
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }

    public static void main(String[] args) {

        ConcreteSubject concreteSubject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver();

        concreteSubject.subscribe(observer1);

        concreteSubject.setGooglePrice(197.00);

        concreteSubject.unsubscribe(observer1);

    }

}
