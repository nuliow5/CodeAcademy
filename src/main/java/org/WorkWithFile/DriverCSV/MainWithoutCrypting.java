package org.WorkWithFile.DriverCSV;

import java.io.*;
import java.util.List;

public class MainWithoutCrypting {
    private static final String CSV_NEW_ONE = "src\\main\\java\\org\\WorkWithFile\\DriverCSV\\files\\withoutCrypt.csv";

    public static void main(String[] args) {
        saveToFile();
        readFile();
    }

    public static List<Driver> setDrivers() {
        List<Driver> drivers = List.of(
                new Driver("Vadimas", "Porche", "LUG000", 150),
                new Driver("Loreta", "Maseraty", "ART123", 10000),
                new Driver("Aronas", "Porche911", "PTR598", 15000)
        );
        return drivers;
    }

    public static void saveToFile() {
        try (BufferedWriter bfWriter = new BufferedWriter(new FileWriter(CSV_NEW_ONE))) {
            for (int i = 0; i < setDrivers().size(); i++) {
                bfWriter.write(String.valueOf(setDrivers().get(i)) + "\n");
            }

            bfWriter.close();
        } catch (IOException e) {
            new Error("Error404 " + e);
        }
    }

    public static void readFile() {
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader(CSV_NEW_ONE));
            String line;
            while ((line = bfReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            new Error("Error404 " + e);
        }
    }
}
