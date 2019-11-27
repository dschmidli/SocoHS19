package CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    private ArrayList menuComponents = new ArrayList();
    private String name;

    public Menu(String newName) {
        name = newName;
    }

    public void add(MenuComponent newMenuComponent) {
        menuComponents.add(newMenuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.print("\n-------------------- " + getName() + " --------------------\n");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}
