package DecoratorPattern;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public  Milk(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }
}
