package org.TrainingInFreeTime.Kata.BuyItem.item;

public class PcItem implements Item, Warehouse{

    private String title;
    private double price;
    private String location;
    private int deliveryTime;

    public PcItem(String title, double price, String location, int deliveryTime) {
        this.title = title;
        this.price = price;
        this.location = location;
        this.deliveryTime = deliveryTime;
    }


    @Override
    public void setTitle(String title) {
        this.title = title;

    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setLocation(String brand) {
        this.location = brand;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setDeliveryTime(int speed) {
        this.deliveryTime = speed;
    }

    @Override
    public int getDeliveryTime() {
        return  deliveryTime;
    }

    @Override
    public String toString() {
        return "PcItem{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", location='" + location + '\'' +
                ", deliveryTime=" + deliveryTime +
                '}';
    }
}
