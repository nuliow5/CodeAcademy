package org.OOP.Polimorfizm.FirstTask;

import java.util.Random;

public abstract class Number {
    protected Random random = new Random();
    private final int arrayLength = random.nextInt(5);

    protected int[] myArray = new int[10];

    public abstract void generate();

    public int sumOfArrayElements(){
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        return sum;
    }

    public int[] getMyArray() {
        return myArray;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }
}
