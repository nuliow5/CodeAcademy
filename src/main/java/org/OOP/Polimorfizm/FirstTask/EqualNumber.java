package org.OOP.Polimorfizm.FirstTask;

public class EqualNumber extends Number{

    @Override
    public void generate() {
        for (int i = 0; i < myArray.length; i++) {
            int randomValue = random.nextInt(200)+5;
            if (randomValue % 2 == 0 ){
                myArray[i] = randomValue;
            }
        }
    }
}
