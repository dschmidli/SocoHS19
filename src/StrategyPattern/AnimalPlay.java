package StrategyPattern;

public class AnimalPlay {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();

        dog.display();
        dog.performFly();

        bird.display();
        bird.performFly();
    }
}
