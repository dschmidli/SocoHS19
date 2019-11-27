package StrategyPattern;

public class Dog extends Animal{

    public Dog() {
        type = "Dog";
        setFlyBehavior(new FlyNoWay());

    }
}
