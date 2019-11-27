package CompositePattern;

public class MenuItem extends MenuComponent {
    private String name;
    private boolean vegetarian;
    private double price;

    public MenuItem(String newName, boolean newVegetarian, double newPrice) {
        name = newName;
        vegetarian = newVegetarian;
        price = newPrice;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }

        System.out.println(", " + getPrice()); }
}
