package StrategyPattern;

public class Animal {
    String type;
    FlyBehavior flyBehavior;

    public String getType() {
        return type;
    }

    public void setFlyBehavior(FlyBehavior newFlyBehavior) {
        flyBehavior = newFlyBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void display() {
        System.out.println("Looks like a " + type);
    }
}
