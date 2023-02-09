package org.OOO.ClassAndMethods.Transports;

public class Bike {
    private String name;

    public Bike(){
        System.out.println("Welcome from default constructor");
    }

    public Bike(String name) {
        this();
        this.name = name;
        System.out.println("Welcome from our contractor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
