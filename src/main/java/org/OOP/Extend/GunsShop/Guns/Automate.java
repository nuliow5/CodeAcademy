package org.OOP.Extend.GunsShop.Guns;

import java.math.BigDecimal;

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

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(4500);
    }
}
