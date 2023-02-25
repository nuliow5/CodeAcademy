package org.OOP.Polimorfizm.TaskSaveInformation;

import java.util.ArrayList;

public class RemoteDisk implements Storage{

    private ArrayList<Info> infoList = new ArrayList<>();
    @Override
    public void saveInfo(Info info) {
        infoList.add(info);

    }

    @Override
    public Info findInfo(int id) {
        for(Info entrance : infoList){
            if (id == entrance.getId()){
                System.out.println(entrance);
                return entrance;
            }
        }
        System.out.println("null");
        return null;
    }

    @Override
    public Info findInfo(String word) {
        for (Info entrance : infoList){
            if (word.equals(entrance.getText())){
                System.out.println(entrance);
                return entrance;
            }
        }
        System.out.println("null");
        return null;
    }
}
