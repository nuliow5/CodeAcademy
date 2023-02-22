package org.OOO.Extend.InheritanceBasic;

public class Dog extends Animal{

    private String name;
    public Dog(String name, String type, String size, double weight) {
        super(type, size, weight);

        this.name = name;
    }

    @Override
    public String makeNoise() {

        return "Hello from Dog Class" + super.makeNoise();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
