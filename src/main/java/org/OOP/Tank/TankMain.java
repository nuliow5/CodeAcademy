package org.OOP.Tank;

public class TankMain {
    public static void main(String[] args) {


        Tank tank = new Tank();

        Map map = new Map(10, tank);
        TankController tankController = new TankController(tank, map);

        tank.printTankInfo();

        tankController.controllerLogic();

    }
}
