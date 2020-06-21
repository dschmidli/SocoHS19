package AbstractFactoryPattern;

public abstract class EnemyShip {

    private String name;
    ESWeapon weapon;
    ESEngine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void makeShip();

    public String toString() {
        return "The " + name + " has a top speed of " + engine + " and an attack power of " + weapon;
    }

}