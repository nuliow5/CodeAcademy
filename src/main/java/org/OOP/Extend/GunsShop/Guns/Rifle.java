package org.OOP.Extend.GunsShop.Guns;

import java.math.BigDecimal;

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

    @Override
    public BigDecimal getPrice() {
        return null;
    }
}
