package org.NullAndExceptions.Exception.firstTask;

import java.util.Random;

public class Plane {
    Random random = new Random();

    public void unfoldTheChassis() throws DivisionFromZero {
        int firstValue = random.nextInt(10);
        int secondValue = 0;


        try {
            int result = firstValue / secondValue;
            System.out.println("OK the chassis has been deployed successfully");

        } catch (ArithmeticException e){
            System.out.println("Error");
        }





    }


}
