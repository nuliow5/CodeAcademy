package org.OOP.Interface.FirstLesson;


import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Jeep> jeepList = new ArrayList<>();
        ArrayList<Frigate> frigateList = new ArrayList<>();
        ArrayList<Hovercraft> hovercraftList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            jeepList.add(new Jeep());
            frigateList.add(new Frigate());
            hovercraftList.add(new Hovercraft());
        }

        //jeepList
        for (int i = 0; i < jeepList.size(); i++) {
            boolean b = jeepList.get(i) instanceof IsSeaVessel;
            System.out.println(b);
        }
        Frigate newFrigate = new Frigate();
        newFrigate.fireGun();

        System.out.println(newFrigate.getDisplacement());

        IsVehicle isVehicle = (IsLandVehicle) jeepList.get(0);

        isVehicle.getMaxSpeed();

        jeepList.get(0).drive();

        hovercraftList.get(0).drive();

        jeepList.get(0).drive();

        IsLandVehicle isLandVehicle1 = new Jeep();
        IsLandVehicle isLandVehicle2 = new Hovercraft();
        System.out.println("-------------------");
        isLandVehicle1.drive();
        isLandVehicle2.drive();

        //2 task
        
        PoliceCar[] policeCars = new PoliceCar[15];

        for (int i = 0; i < policeCars.length; i++) {
            policeCars[i] = new PoliceCar();
        }

        policeCars[0].soundSiren();
    }
}
