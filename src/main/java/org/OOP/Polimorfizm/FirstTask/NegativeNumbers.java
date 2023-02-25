package org.OOP.Polimorfizm.FirstTask;

public class NegativeNumbers extends Number{

    @Override
    public void generate() {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(99)-100;
        }
    }
}
