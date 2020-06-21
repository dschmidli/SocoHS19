package AbstractFactoryPattern;

public class UFOEnemyShip extends EnemyShip {

    EnemyShipFactory enemyShipFactory;

    public UFOEnemyShip(EnemyShipFactory enemyShipFactory) {
        this.enemyShipFactory = enemyShipFactory;
    }

    public void makeShip() {
        System.out.println("Making enemy ship " + getName());
        weapon = enemyShipFactory.addESGun();
        engine = enemyShipFactory.addESEngine();
    }
}
