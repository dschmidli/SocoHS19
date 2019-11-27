package StrategyPattern;

public class Bird extends Animal{

    public  Bird() {
        type = "Bird";
        setFlyBehavior(new FlyWithWings());
    }
}
