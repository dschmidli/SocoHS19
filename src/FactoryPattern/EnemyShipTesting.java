package FactoryPattern;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("What type of ship? (U / R)");

        if(userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();

            theEnemy = enemyShipFactory.makeEnemyShip(typeOfShip);
        }

        if(theEnemy != null) {
            doStuffEnemy(theEnemy);
        }
        else {
            System.out.println("Enter a 'U', 'R', or 'BU' next time");
        }

        // Example of bade code
        /*EnemyShip theEnemy = null;

        EnemyShip ufoShip = new UFOEnemyShip();

        Scanner userInput = new Scanner(System.in);

        String enemyShipOption = "";

        System.out.println("What type of ship? (U / R)");

        if(userInput.hasNextLine()) {
            enemyShipOption = userInput.nextLine().toUpperCase();
        }

        if(enemyShipOption.equals("U")) {
            theEnemy = new UFOEnemyShip();
        }
        else if(enemyShipOption.equals("R")) {
            theEnemy = new RocketEnemyShip();
        }

        doStuffEnemy(theEnemy);*/
    }

    public static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
