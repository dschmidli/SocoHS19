package IteratorPattern;

public class DinnerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", true, 2.99);
        addItem("Hotdog", false, 3.05);
    }

    public void addItem(String name, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Menu is full !");
        }
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }

    /*
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    */
}
