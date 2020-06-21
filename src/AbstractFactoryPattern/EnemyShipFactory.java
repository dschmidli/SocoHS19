package AbstractFactoryPattern;

import FactoryPattern.BigUFOEnemyShip;
import FactoryPattern.EnemyShip;
import FactoryPattern.RocketEnemyShip;
import FactoryPattern.UFOEnemyShip;

public interface EnemyShipFactory {

    public ESWeapon addESGun();
    public ESEngine addESEngine();
}
