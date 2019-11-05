import java.util.ArrayList;

public class Waitress {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
        DinnerMenu dinnerMenu = new DinnerMenu();
        // MenuItem[] lunchItems = dinnerMenu.getMenuItems();

        Iterator iterator = breakfastItems.createIterator();
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next(); }
        Iterator iterator2 = breakfastItems.createIterator();
        while (iterator2.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator2.next(); }


        /*
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
        }

        // -4 is needed, otherwise the loop runs out of range
        for (int i = 0; i < lunchItems.length-4; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
        }
        */
    }
}
