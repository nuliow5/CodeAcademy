package org.OOO.Extend.InheritanceBasic;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Laukinis", "small", 10.5);
        System.out.println(animal.makeNoise());
        System.out.println(animal);

        animal.testMethod();

        Dog dog = new Dog("Murzius","Gauruotas", "Didelis", 33);
        System.out.println(dog);
        System.out.println(dog.makeNoise());
    }


    public static void testMethod(){
        System.out.println(" #Hello from main ");
    }
}
