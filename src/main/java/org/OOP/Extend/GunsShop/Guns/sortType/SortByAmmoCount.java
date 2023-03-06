package org.OOP.Extend.GunsShop.Guns.sortType;

import org.OOP.Extend.GunsShop.Guns.Gun;

import java.util.Comparator;

public class SortByAmmoCount implements Comparator<Gun> {

    @Override
    public int compare(Gun o1, Gun o2) {
        return o1.getAmmoCount() - o2.getAmmoCount();
    }
}
