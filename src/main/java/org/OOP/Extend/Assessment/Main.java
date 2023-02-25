package org.OOP.Extend.Assessment;

public class Main {
    public static void main(String[] args) {
        AllMaintained allMaintained = new AllMaintained(
                10,
                5,
                5);

        System.out.println(allMaintained.finalScore());


        Weights weights = new Weights(
                10,
                6,
                6);

        System.out.println(weights.finalScore());
    }
}
