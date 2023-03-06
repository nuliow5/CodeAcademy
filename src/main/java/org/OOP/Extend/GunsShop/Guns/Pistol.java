package org.OOP.Extend.GunsShop.Guns;

import java.math.BigDecimal;

public class Pistol extends Gun {

    private String name;

    public Pistol(String name, float caliber, GunType gunType, int ammoCount) {
        super(caliber, gunType, ammoCount);
        this.name = name;
    }

    @Override
    public String getInformation() {
        return "Implement Pistol -> ";
    }

//    @Override
//    public String toString() {
//        return getInformation() + "{" +
//                "name='" + name +
//                "', caliber=" + getCaliber() +
//                ", gunType=" + getGunType() +
//                ", ammoCount=" + getAmmoCount() +
//                "}";
//    }

    @Override
    public double getIndex() {
        return 60;
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(500);
    }
}
