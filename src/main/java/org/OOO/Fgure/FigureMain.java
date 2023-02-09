package org.OOO.Fgure;

import java.util.Random;

public class FigureMain {
    public static void main(String[] args) {

        Figure figure = new Figure();

        figure.setName("Strange Figure");
        figure.setHeight(10);
        figure.setWidth(15);
        figure.printInfo();
        System.out.println("Get Height = " + figure.getHeight());

        System.out.println("------------------------------------------------");

        Figure rectangle = new Figure("Rectangle", 100, 200);
        rectangle.printInfo();

        rectangle.setWidth(101);
        rectangle.printInfo();
        rectangle.getWidth();

        //areaCalculation
        System.out.println(rectangle.areaCalculation(10, 50));

        //perimeter count
        System.out.println("Perimeter is = " + rectangle.perimeterCount(5, 2));

        System.out.println("------------------------------------------------");

        Figure square = new Figure("square", 10, 20);
        square.printInfo();

        //test
        square.setHeight(777);
        square.printInfo();

        //Random
        System.out.println("----------------RANDOM--------------------------------");

        Random random = new Random();
        int a = -1;

        boolean start = true;

        while (start){
            a = random.nextInt(10);
            if (a == 1){


                start = false;
            }
            System.out.println(a);
        }





    }
}
