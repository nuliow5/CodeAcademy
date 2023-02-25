package org.OOP.Interface.FirstLesson;

public class Jeep implements IsLandVehicle{

    public void soundHorn(){
        System.out.println("Zum zum");
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
        System.out.println("Move forward");
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
