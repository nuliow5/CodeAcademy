package org.OOP.Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MyMapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("987456", 5);
//        map.put("12345", 1);
//        map.put("qwer", 2);
        String key = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            key = entry.getKey();
            System.out.println(map.get(key));
        }

//        System.out.println(key);



    }
}
