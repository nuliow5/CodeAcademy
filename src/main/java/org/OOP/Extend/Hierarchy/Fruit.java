package org.OOP.Extend.Hierarchy;

public class Fruit {
    protected int size;
    protected String color;
    protected String taste;

    public Fruit(int size, String color, String taste) {
        this.size = size;
        this.color = color;
        this.taste = taste;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getTaste() {
        return taste;
    }
    public void whoIam(){
        System.out.printf("size -> %2s | color -> %5s | taste -> %5s \n", getSize(), getColor(), getTaste());
    }



}
