package org.OOP.Extend.Hierarchy;

public class ExoticFruit extends Fruit{

    protected String location;
    public ExoticFruit(int size, String color, String taste, String location) {
        super(size, color, taste);
        this.location = location;
    }

    @Override
    public void whoIam() {
        System.out.println(getLocation());
    }

    public String getLocation() {
        return location;
    }
}
