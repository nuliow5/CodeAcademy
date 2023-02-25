package org.OOP.Collection.HashSet;

import java.util.Arrays;
import java.util.HashSet;
public class HashStart {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("aaa");
        hashSet.add("bbb");
        hashSet.add("Aaa");
        hashSet.add("baba");
        hashSet.add("aba");

        String eee = "aaa";

        hashSet.remove("aba");

        String[] myArray = {"1", "2", "3"};

        hashSet.toArray(); //grazint obj[] array

        System.out.println("String[] " + Arrays.toString(myArray));


        System.out.println("hash " + hashSet);

//        for (String tempValue : hashSet) {
//            System.out.println(tempValue);
//        }

        System.out.println(hashSet.contains(eee));



    }
}
