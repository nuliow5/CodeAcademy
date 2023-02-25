package org.OOP.Extend.GunsShop;

import org.OOP.Extend.GunsShop.Guns.*;

public class Main {
    public static void main(String[] args) {


        Pistol pistol = new Pistol("Glock", 9F, GunType.MANUAL, (short) 19);
        System.out.println(pistol);

        Rifle rifle = new Rifle(6.53F, GunType.MANUAL, (short) 5);
        System.out.println(rifle);

        Automate automat = new Automate(5.56F, GunType.AUTOMATIC, (short) 30);
        System.out.println(automat);
        System.out.println("Cost is " + automat.getCost());

        Gun[] guns = new Gun[3];
        guns[0] = pistol;
        guns[1] = rifle;
        guns[2] = automat;

        for (Gun gun : guns) {
            System.out.println(gun.getPrice());
        }

        HasPrice[] gunsPrices = new Gun[3];
        gunsPrices[0] = pistol;
        gunsPrices[1] = rifle;
        gunsPrices[2] = automat;

        for(HasPrice hasPrice : gunsPrices){
            System.out.println(
                    ((Gun)hasPrice).getPrice()
            );
        }

    }
}
