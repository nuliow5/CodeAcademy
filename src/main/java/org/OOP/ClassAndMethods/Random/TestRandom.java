package org.OOP.ClassAndMethods.Random;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random();
        while (true){
            int randomValue = random.nextInt(10);
            System.out.println(randomValue);
        }
    }
}
