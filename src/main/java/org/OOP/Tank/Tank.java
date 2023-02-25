package org.OOP.Tank;

import java.util.Random;

public class Tank {
    Random random = new Random();
    private int xCoordinate;
    private int yCoordinate;

    public Tank() {
        this.xCoordinate = 5;
        this.yCoordinate = 5;

    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public void printTankInfo(){

        System.out.println("\n____________ " +
                "\nTank location is \n" +
                "x: " + xCoordinate +
                "\ny: " + yCoordinate);

    }

}
