package FactoryPattern;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip enemyShip = null;

        if(newShipType.toUpperCase().equals("U")) {
            return new UFOEnemyShip();
        }

        else if (newShipType.toUpperCase().equals("R")) {
            return new RocketEnemyShip();
        }

        else if (newShipType.toUpperCase().equals("BU")) {
            return new BigUFOEnemyShip();
        }

        else {
            return null;
        }
    }
}
