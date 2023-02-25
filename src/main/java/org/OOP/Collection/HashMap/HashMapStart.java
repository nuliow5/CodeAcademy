package org.OOP.Collection.HashMap;

import java.util.*;

public class HashMapStart {
    public static void main(String[] args) {
        HashMap<Integer, Month> monthMap = new HashMap<>();

        monthMap.put(1, new Month("January", 1));
        monthMap.put(2, new Month("January", 1));
        monthMap.put(33,new Month("Q", 2));

        System.out.println(monthMap);
        System.out.println(monthMap.get(33));
        System.out.println(monthMap.keySet());
        System.out.println(monthMap.values());

//        for (int i = 0; i < monthMap.size(); i++) {
//            if (monthMap.containsValue() == 1){
//                System.out.println("qqqqqqq");
//            } else {
//                System.out.println("AAAAAAAAAAAA");
//            }
//        }

        //perkelti HashMap i HashSet be dublikatus
        HashSet<String> mySet = new HashSet<>();

        for (Map.Entry entry : monthMap.entrySet()){
            mySet.add((String) entry.getValue());
        }

        System.out.println("HashSet be dubkikatu " + mySet);



    }

}
