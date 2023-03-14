package org.OOP.Extend.test;

public class Student extends Person{

    private final int id;
    public Student(String name, int age, int weight, int height, int id) {
        super(name, age, weight*10, height);
        this.id = id;

    }

    public void printInfo(){
        System.out.println(
                getName() + " " +
                getAge() + " " +
                getHeight() + " cm " +
                getWeight() + " kg " +
                id
        );

    }

    public static void thisIsStaticBabe(){
        System.out.println("This is static 12345");
    }
}
