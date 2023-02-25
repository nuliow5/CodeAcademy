package org.OOP.Extend.Hierarchy;

public class LithuanianFruit extends Fruit{
    protected boolean vaccinated;
    public LithuanianFruit(int size, String color, String taste, boolean vaccinated) {
        super(size, color, taste);
        this.vaccinated = vaccinated;
    }
}
