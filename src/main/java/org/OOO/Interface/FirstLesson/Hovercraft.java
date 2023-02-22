package org.OOO.Interface.FirstLesson;

import java.util.SortedMap;

public class Hovercraft implements IsLandVehicle, IsSeaVessel{

    public void enterLand(){
        System.out.println("Enter land -> ");
    }

    public void enterSea(){
        System.out.println("Enter sea -> ");
    }

    @Override
    public int getNumWheels() {
        return 0;
    }

    @Override
    public void setNumWheels(int NumWheels) {

    }

    @Override
    public void drive() {
        System.out.println("Slip the watter");
    }

    @Override
    public int getDisplacement() {
        return 0;
    }

    @Override
    public void setDisplacement(int displacement) {

    }

    @Override
    public void launch() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getMaxPassengers() {
        return 0;
    }

    @Override
    public void setMaxPassengers(int numberOfPassengers) {

    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public void setMaxSpeed(int speed) {

    }
}
