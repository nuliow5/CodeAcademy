package org.WorkWithFile.DriverCSV;

import java.io.Serializable;

public class Driver implements Serializable {
    private final String name;
    private String auto;
    private String autoNr;
    private double mileage;

    public Driver(String name, String auto, String autoNr, double mileage) {
        this.name = name;
        this.auto = auto;
        this.autoNr = autoNr;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return   "\"" + name + "\"" +
                ",\"" + auto + "\"" +
                ",\"" + autoNr + "\"" +
                ",\"" + mileage + "\"" ;
    }
}
