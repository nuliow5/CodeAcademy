package org.OOO.Extend.Hierarchy;

public class Main {
    public static void main(String[] args) {

        Fruit fruit = new Fruit(5, "Blue", "Niam Niam");
        fruit.whoIam();

        ExoticFruit exoticFruit = new ExoticFruit(1,
                "Red",
                "Umm",
                "Afrika");

        exoticFruit.whoIam();

        Apple_Alyvinis appleAlyvinis = new Apple_Alyvinis(777,
                "Green",
                "Labai skanu!",
                true,
                "Summer");

        boolean b = exoticFruit instanceof Fruit;

        System.out.println("True/false " + b);


    }
}
