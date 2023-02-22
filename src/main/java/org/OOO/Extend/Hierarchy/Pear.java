package org.OOO.Extend.Hierarchy;

public class Pear extends LithuanianFruit{
    protected String sortOfPear;
    public Pear(int size, String color, String taste, boolean vaccinated, String sortOfPear) {
        super(size, color, taste, vaccinated);
        this.sortOfPear =sortOfPear;
    }
}
