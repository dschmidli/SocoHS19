package DecoratorPattern;

public class CoffeeMachine {

    public static void main(String[] args) {
        Espresso e = new Espresso();
        System.out.println(e.cost());

        HouseBlend hb = new HouseBlend();
        System.out.println(hb.cost());

        Beverage em = new Mocha(new Espresso());
        System.out.println("Description: " + em.getDescription());
        System.out.println("Price: " + em.cost());

        Beverage emm = new Milk(new Mocha(new Espresso()));
        System.out.println("Description: " + emm.getDescription());
        System.out.println("Price: " + emm.cost());

        Beverage hbmm = new Milk(new Mocha(new HouseBlend()));
        System.out.println("Description: " + hbmm.getDescription());
        System.out.println("Price: " + hbmm.cost());

    }
}
