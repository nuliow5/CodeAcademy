package org.OOP.ClassAndMethods;

import org.OOP.ClassAndMethods.Transports.Auto;
import org.OOP.ClassAndMethods.Transports.Bike;

public class MainClass {
    public static void main(String[] args) {
        Auto sportCar = new Auto("ferrari f40");

        Bike sportBike =  new Bike("Suzuki GSX-S 1000GT");

        System.out.println(sportCar.getName());
        System.out.println(sportBike.getName());
    }
}
