package org.OOO.Collection.HashMap.FirstTask;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(11, "Vienuolika");
        hashMap.put(12, "dvylika");
        hashMap.put(100, "simtas");
        //#1
        System.out.println(hashMap);

        //#2
        System.out.println("#12? " + hashMap.containsKey(12));
        System.out.println("#vienas? " + hashMap.containsValue("vienas"));

        System.out.println("#12 is -> " + hashMap.get(12));

        printHashMap(hashMap);




    }

    public static void printHashMap(HashMap<Integer, String> hashMap){
        for (Map.Entry entry : hashMap.entrySet()){
            System.out.println("Raktas: " + entry.getKey() + " Reiksme: " + entry.getValue());
        }
    }
}
