package org.OOO.Extend.GunsShop.Guns;

public class Rifle extends Gun{
    public Rifle(float caliber, GunType gunType, int ammoCount) {
        super(caliber, gunType, ammoCount);
    }




    @Override
    public String getInformation() {
        return "Implement Rifle -> ";
    }

    @Override
    public double getIndex() {
        return 200;
    }
}
