package org.OOP.Polimorfizm.TaskSaveInformation;

import java.util.HashMap;
import java.util.Map;

public class DataBase implements Storage{

    private HashMap<Integer, Info> hashMap = new HashMap<>(); //id , infoObj

    @Override
    public void saveInfo(Info info) {
        hashMap.put(info.getId(), info);
        System.out.println(hashMap);

    }

    @Override
    public Info findInfo(int id) {
        System.out.println(hashMap.get(id));
        return hashMap.get(id);

    }

    @Override
    public Info findInfo(String word) {
        for (Map.Entry<Integer, Info> entry : hashMap.entrySet()){
            if (word.equals(hashMap.get(entry.getKey()).getText())){
                System.out.println(entry.getValue());
                return entry.getValue();
            }
        }
        System.out.println("null");
        return null;

    }
}
