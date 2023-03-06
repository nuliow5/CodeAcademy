package org.OOP.Extend.GunsShop;

import org.OOP.Extend.GunsShop.Guns.*;
import org.OOP.Extend.GunsShop.Guns.sortType.SortByAmmoCount;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Gun> gunList = new ArrayList<>();


        gunList.add(new Pistol("Glock", 9F, GunType.MANUAL, (short) 19));
        gunList.add(new Rifle(6.53F, GunType.MANUAL, (short) 5));
        gunList.add(new Automate(5.56F, GunType.AUTOMATIC, (short) 30));


        printGuns(gunList);
        System.out.println("-------------");

//        Collections.sort(gunList);
//        printGuns(gunList);

        Collections.sort(gunList, new SortByAmmoCount());
        printGuns(gunList);

    }

    public static void printGuns(List<Gun> guns){
        for (Gun gun : guns){
            System.out.println(gun);
        }
    }
}
