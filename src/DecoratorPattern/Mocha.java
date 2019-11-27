package DecoratorPattern;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
