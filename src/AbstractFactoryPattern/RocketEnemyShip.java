package AbstractFactoryPattern;

public class RocketEnemyShip extends EnemyShip{

    EnemyShipFactory enemyShipFactory;

    public RocketEnemyShip(EnemyShipFactory enemyShipFactory) {
        this.enemyShipFactory = enemyShipFactory;
    }

    public void makeShip() {
        System.out.println("Making enemy ship " + getName());
        weapon = enemyShipFactory.addESGun();
        engine = enemyShipFactory.addESEngine();
    }

}
