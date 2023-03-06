package org.TrainingInFreeTime.Kata.BuyItem.item;

public interface Warehouse {
    void setLocation(String brand);
    String getLocation();

    void setDeliveryTime(int speed);

    int getDeliveryTime();
}
