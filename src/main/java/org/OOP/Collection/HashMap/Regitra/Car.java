package org.OOP.Collection.HashMap.Regitra;

import java.time.LocalDate;

public class Car {
    private String carModel;
    private String carNumber;
    private LocalDate registerDate;
    private String carOwner;

    private static int id = 0;

    private int idInRegistryList;

    public Car(String carModel, String carNumber, LocalDate registerDate, String carOwner) {
        this.carModel = carModel;
        this.carNumber = carNumber;
        this.registerDate = registerDate;
        this.carOwner = carOwner;
        id++;
        this.idInRegistryList += id;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public String getCarOwner() {
        return carOwner;
    }
}
