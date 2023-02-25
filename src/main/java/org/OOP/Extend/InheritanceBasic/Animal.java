package org.OOP.Extend.InheritanceBasic;

public class Animal {
    private String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(type + " move " + speed);
    }

    public String makeNoise() {
        return type + " make some noise";
    }

    public void testMethod(){
        System.out.println(" Hello from Animal class");
    }
}
