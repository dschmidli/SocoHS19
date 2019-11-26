package DecoratorPattern;

public class Main {

    public static void main(String[] args) {
        Espresso e = new Espresso();
        System.out.println(e.cost());

        HouseBlend hb = new HouseBlend();
        System.out.println(hb.cost());
    }
}
