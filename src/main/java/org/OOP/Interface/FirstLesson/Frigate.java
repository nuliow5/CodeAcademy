package org.OOP.Interface.FirstLesson;

public class Frigate implements IsSeaVessel{

    public void fireGun(){
        System.out.println("Boom");
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
