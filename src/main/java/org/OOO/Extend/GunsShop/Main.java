package org.OOO.Extend.GunsShop;

import org.OOO.Extend.GunsShop.Guns.Automate;
import org.OOO.Extend.GunsShop.Guns.GunType;
import org.OOO.Extend.GunsShop.Guns.Pistol;
import org.OOO.Extend.GunsShop.Guns.Rifle;

public class Main {
    public static void main(String[] args) {


        Pistol pistol = new Pistol("Glock", 9F, GunType.MANUAL, (short) 19);
        System.out.println(pistol);

        Rifle rifle = new Rifle(6.53F, GunType.MANUAL, (short) 5);
        System.out.println(rifle);

        Automate automat = new Automate(5.56F, GunType.AUTOMATIC, (short) 30);
        System.out.println(automat);
        System.out.println("Cost is " + automat.getCost());

    }
}
