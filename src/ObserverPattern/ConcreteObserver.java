package ObserverPattern;

public class ConcreteObserver implements Observer {
    private double googlePrice;

    private static int observerIDTracker = 0;

    private int observerID;

    public ConcreteObserver() {
        this.observerID = ++observerIDTracker;
    }

    @Override
    public void update(double googlePrice) {
        this.googlePrice = googlePrice;
        System.out.println("ID: " + observerID + "\nGoogle: " + googlePrice);
    }
}
