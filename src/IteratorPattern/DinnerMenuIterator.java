package IteratorPattern;

public class DinnerMenuIterator implements Iterator {
    MenuItem[] items;
    int position;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        else {
            return true;
        }
    }
}
