package org.OOP.Collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        HashSet<String> aibe = new HashSet<>();

        aibe.add("Obuolys");
        aibe.add("Pomidoras");
        aibe.add("Obuolys");

        System.out.println(aibe);

        Iterator<String> iteratorius = aibe.iterator();
        while(iteratorius.hasNext()) {
            System.out.println("+++" + iteratorius.next());
        }

        System.out.println(aibe.contains("Pomidoras2"));


        aibe.remove("Obuolys");
        for(String elem : aibe) {
            System.out.println("----->" + elem);
        }

        aibe.clear();
        System.out.println(aibe.size());
        System.out.println(aibe.isEmpty());
    }
}
