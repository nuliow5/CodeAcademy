package org.Basic.ForTesting.OOOTest;

public class AnimalMain {
    public static void main(String[] args) {

        Animal cat = new Animal(1, "Murzius");

        cat.setName("newName");

        cat.speaking();

        System.out.println(cat.getName());
    }
}
