package AbstractFactoryPattern;

public class EnemyShipTesting {

    public static void main(String[] args) {
        EnemyShipBuilding makeUFOs = new ConcreteEnemyShipBuilding();

        EnemyShip theUFO = makeUFOs.orderTheShip("UFO");
        System.out.println(theUFO + "\n");

        EnemyShip theRocket = makeUFOs.orderTheShip("ROCKET");
        System.out.println(theRocket + "\n");

    }

}
