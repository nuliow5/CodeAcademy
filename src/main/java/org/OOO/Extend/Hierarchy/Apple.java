package org.OOO.Extend.Hierarchy;

public class Apple extends LithuanianFruit{

    protected String harvesting;
    public Apple(int size, String color, String taste, boolean vaccinated, String harvesting) {
        super(size, color, taste, vaccinated);

        this.harvesting = harvesting;
    }
}
