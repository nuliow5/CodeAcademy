package org.OOP.Extend.GunsShop.Guns;

import java.math.BigDecimal;
import java.util.Comparator;

public abstract class Gun implements HasPrice {
    private float caliber;
    private GunType gunType;
    private int ammoCount;
    private double cost;

    public Gun(float caliber, GunType gunType, int ammoCount) {
        this.caliber = caliber;
        this.gunType = gunType;
        this.ammoCount = ammoCount;

        this.cost = caliber * getIndex();
    }

    public double getCost() {
        return cost;
    }

    public float getCaliber() {
        return caliber;
    }

    public GunType getGunType() {
        return gunType;
    }

    public int getAmmoCount() {
        return ammoCount;
    }

    @Override
    public String toString() {
        return  getInformation() + "{caliber=" + caliber +
                ", gunType=" + gunType +
                ", ammoCount=" + ammoCount +
                ", price=" + cost +
                '}';
    }

    public abstract String getInformation();

    public abstract double getIndex();

//    @Override
//    public int compareTo(Gun gun) {
//        return Double.compare(this.getCost(), gun.getCost());
//    }



}
