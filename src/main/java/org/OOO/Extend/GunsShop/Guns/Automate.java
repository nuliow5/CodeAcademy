package org.OOO.Extend.GunsShop.Guns;

public class Automate extends Gun{
    public Automate(float caliber, GunType gunType, int ammoCount) {
        super(caliber, gunType, ammoCount);
    }

    @Override
    public String getInformation() {
        return "Implement Automate -> ";
    }
    @Override
    public double getIndex() {
        return 60;
    }
}
