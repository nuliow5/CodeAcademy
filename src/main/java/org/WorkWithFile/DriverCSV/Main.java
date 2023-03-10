package org.WorkWithFile.DriverCSV;

import java.io.*;
import java.util.List;

public class Main {
    private static final String CSV = "src\\main\\java\\org\\WorkWithFile\\DriverCSV\\files\\myFile.csv";

    public static void main(String[] args) {
        saveToFile();
        readFromFile();
//        System.out.println(setDrivers());

    }

    public static List<Driver> setDrivers(){
        List<Driver> drivers = List.of(
                new Driver("Vadimas", "Porche", "LUG000", 150),
                new Driver("Loreta", "Maseraty", "ART123", 10000),
                new Driver("Aronas", "Porche911", "PTR598", 15000)
        );
        return drivers;
    }

    private static void saveToFile(){
        try (FileOutputStream out = new FileOutputStream(CSV);
             ObjectOutputStream outputStream = new ObjectOutputStream(out)){
            outputStream.writeObject(setDrivers());
        } catch (IOException e){
            new Error("Error! " + e.getMessage());
        }
    }

    private static void readFromFile()  {
        try (FileInputStream in = new FileInputStream(CSV);
             ObjectInputStream inputStream = new ObjectInputStream(in)){
            List<Driver> newList = (List<Driver>) inputStream.readObject();

            for (Driver driver : newList) {
                System.out.println(driver);
            }

        } catch (IOException | ClassNotFoundException e){
            new Error("Error1! " + e.getMessage());
        }

    }
}
