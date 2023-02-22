package org.OOO.Interface.FirstLesson;

public class PoliceCar implements IsEmergency, IsLandVehicle {

    private String name;
    private int maxPassengers;
    private int numWheels;
    private int maxSpeed;

    public PoliceCar(String name, int maxPassengers, int numWheels, int maxSpeed) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.numWheels = numWheels;
        this.maxSpeed = maxSpeed;
    }
    public PoliceCar(){

    }


    @Override
    public void soundSiren() {
        System.out.println("weUuuuUaaa");
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("Moving " + getMaxSpeed() + " max speed");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public void setMaxPassengers(int numberOfPassengers) {
        this.maxPassengers = numberOfPassengers;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }
}
