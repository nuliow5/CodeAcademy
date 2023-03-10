package org.WorkWithFile.StreamSecond;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
    Tipizuotu failu kurimas, atidarius faila, matome kad jis uzkoduotas
 */
public class Main {
    private static final String ORIGINAL = "src\\main\\java\\org\\WorkWithFile\\StreamSecond\\files\\myFile.txt";

    public static void main(String[] args) {
        saveToFile();
        readFromFile();

    }

    private static void readFromFile()  {
        try (FileInputStream in = new FileInputStream(ORIGINAL);
             ObjectInputStream inputStream = new ObjectInputStream(in)){
            List<Person> newList = (List<Person>) inputStream.readObject();
            for (Person person : newList) {
                System.out.println(person);
            }

        } catch (IOException | ClassNotFoundException e){
            new Error("Error1! " + e.getMessage());
        }

    }

    private static void saveToFile() {
        try (FileOutputStream out = new FileOutputStream(ORIGINAL);
             ObjectOutputStream outputStream = new ObjectOutputStream(out)){
            outputStream.writeObject(objToList());
        } catch (IOException e){
            new Error("Error! " + e.getMessage());
        }


    }

    private static ArrayList<Person> objToList() {
        List<Person> persons = List.of(
                new Person("Vadimas", 37),
                new Person("Eva", 3),
                new Person("Loreta", 37)
        );

        return (ArrayList<Person>) persons;
    }
}
