package AbstractFactoryPattern;

public abstract class EnemyShipBuilding {

    protected abstract EnemyShip makeEnemyShip(String newShipType);

    public EnemyShip orderTheShip(String typeOfShip) {
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);

        theEnemyShip.makeShip();

        return theEnemyShip;
    }
}
