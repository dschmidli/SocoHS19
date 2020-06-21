package AbstractFactoryPattern;

public class ConcreteEnemyShipBuilding extends EnemyShipBuilding{
    protected EnemyShip makeEnemyShip(String typeOfShip) {

        EnemyShip theEnemyShip = null;

        if(typeOfShip.equals("UFO")){
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Ship");

        }
        else if(typeOfShip.equals("ROCKET")){
            EnemyShipFactory shipPartsFactory = new RocketEnemyShipFactory();
            theEnemyShip = new RocketEnemyShip(shipPartsFactory);
            theEnemyShip.setName("Rocket Ship");
        }

        return theEnemyShip;

    }

}
