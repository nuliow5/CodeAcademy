package org.OOP.Tank;

import java.util.Scanner;

public class TankController {

    Scanner scanner = new Scanner(System.in);


    private Compass vector;
    private Tank tank;
    private boolean myGame = true;
    Map map;

    static int[] saveDataAfterMethod;

    public TankController(Tank tank, Map map) {

        this.tank = tank;
        this.vector = Compass.North; //North
        this.map = map;

    }


    public void controllerLogic() {
        while (myGame) {
            //menu
            System.out.println("----------MENU-----------");
            System.out.println("#8 -> for move UP");
            System.out.println("#2 -> for move DOWN");
            System.out.println("#4 -> for move LEFT");
            System.out.println("#6 -> for move RIGHT");
            System.out.println("#5 -> Shoot");
            System.out.println("#0 -> Print map");
            System.out.println("-------------------");

            int menuInput = scanner.nextInt();
            if (menuInput == 8) {
                moveUp();
            } else if (menuInput == 2) {
                moveDown();
            } else if (menuInput == 4) {
                moveLeft();
            } else if (menuInput == 6) {
                moveRight();
            } else if (menuInput == 5) {
                makeShoot();
            } else if (menuInput == 0) {
                map.printMap();
                System.out.println("*************************");
            } else {
                myGame = false;
            }


        }

    }

    public void moveUp() {
        //take tank coordinates
        int x = tank.getxCoordinate();
        int y = tank.getyCoordinate();


        if (y < 1 || y > 10) {
            System.out.println("!!! You cant move here. You ara at edge of the game map");
        } else {
            tank.setxCoordinate(x);
            tank.setyCoordinate(y - 1);
            this.vector = Compass.North;
            System.out.println("Tank moving UP to - " + this.vector);
            tank.printTankInfo();

//            System.out.println("----" + map.getMapSize());
        }
    }

    public void moveDown() {
        int x = tank.getxCoordinate();
        int y = tank.getyCoordinate();

        if (y > 10) {
            System.out.println("!!! You cant move here. You ara at edge of the game map");
        } else {
            tank.setxCoordinate(x);
            tank.setyCoordinate(y + 1);
            this.vector = Compass.South;
            System.out.println("Tank moving DOWN to - " + this.vector);
            tank.printTankInfo();

        }
    }

    public void moveLeft() {
        int x = tank.getxCoordinate();
        int y = tank.getyCoordinate();

        if (x < 1 || x > 10) {
            System.out.println("!!! You cant move here. You ara at edge of the game map");
        } else {
            tank.setxCoordinate(x - 1);
            tank.setyCoordinate(y);
            this.vector = Compass.West;
            System.out.println("Tank moving LEFT to - " + this.vector);
            tank.printTankInfo();

        }
    }

    public void moveRight() {
        int x = tank.getxCoordinate();
        int y = tank.getyCoordinate();

        if (x < 1 || x > 10) {
            System.out.println("!!! You cant move here. You ara at edge of the game map");
        } else {
            tank.setxCoordinate(x + 1);
            tank.setyCoordinate(y);
            this.vector = Compass.East;

            System.out.println("Tank moving RIGHT to - " + this.vector);
            tank.printTankInfo();

        }
    }

    public void makeShoot() {
        System.out.println("░░░░░░███████ ]▄▄▄▄▄▄▄▄\n" +
                " ▂▄▅█████████▅▄▃▂        \n" +
                "[███████████████████]. \n" +
                "◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤.. ");
        System.out.println("========o     Tank shooting in " + this.vector);
    }

}
