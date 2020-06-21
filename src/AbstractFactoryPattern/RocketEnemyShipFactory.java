package AbstractFactoryPattern;

public class RocketEnemyShipFactory implements EnemyShipFactory {

    public ESWeapon addESGun() {
        return new ESRocketGun();
    }

    public ESEngine addESEngine() {
        return new ESRocketEngine();
    }
}
