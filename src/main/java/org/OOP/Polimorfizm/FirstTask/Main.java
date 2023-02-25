package org.OOP.Polimorfizm.FirstTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        run(new PositiveNumber());
        run(new EqualNumber());
        run(new NotEqualNumber());
        run(new NegativeNumbers());

    }

    public static void run(Number num){
        num.generate();
        System.out.println(Arrays.toString(num.myArray));

    }
}
