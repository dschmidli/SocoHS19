package ObserverPattern;

public interface Subject {
    public void subscribe(Observer aObserver);
    public void unsubscribe(Observer aObserver);
    public void notifyObserver();
}
