package CompositePattern;

public class Waiter {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU");
        MenuComponent dinerMenu = new Menu("DINER MENU");
        MenuComponent cafeMenu = new Menu("CAFE MENU");
        MenuComponent dessertMenu = new Menu("DESSERT MENU");

        MenuComponent allMenus = new Menu("ALL MENUS");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        dinerMenu.add(new MenuItem("Pasta", true, 3.89));
        cafeMenu.add(new MenuItem("Espresso", true, 0.99));
        dessertMenu.add(new MenuItem("Pie", true, 1.59));

        System.out.println();
        allMenus.print();



    }
}
