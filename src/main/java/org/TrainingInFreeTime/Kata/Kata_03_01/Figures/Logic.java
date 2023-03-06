package org.TrainingInFreeTime.Kata.Kata_03_01.Figures;

import org.TrainingInFreeTime.Kata.Kata_03_01.Figures.Figures.Circle;
import org.TrainingInFreeTime.Kata.Kata_03_01.Figures.Figures.Rectangle;
import org.TrainingInFreeTime.Kata.Kata_03_01.Figures.Figures.RightTriangle;
import org.TrainingInFreeTime.Kata.Kata_03_01.Figures.Figures.Shape;
import org.TrainingInFreeTime.Kata.Kata_03_01.Figures.info.ObjInfo;

import java.util.Random;

public class Logic {
    private final Random random = new Random();
    private final Shape[] shapes = new Shape[10];
    public void resultOfRandomFiguresArea(){

        for (int i = 0; i <shapes.length ; i++) {
            int randomValue = random.nextInt(3)+1;

            if (randomValue == 1){
                shapes[i] = new Rectangle(randomDouble(), randomDouble());
            } else if (randomValue == 2) {
                shapes[i] = new RightTriangle(randomDouble() , randomDouble());

            }else {
                shapes[i] = new Circle(randomDouble());
            }
        }


    }

    public double randomDouble(){
        double min = 1;
        double max = 10;

        double result = min + (max - min) * random.nextDouble();
        return result;
    }

    public void result(){
        resultOfRandomFiguresArea();
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].print();
        }
        sumAllFiguresAre();
    }

    public void sumAllFiguresAre(){
        double sum = 0;

        for (int i = 0; i < shapes.length; i++) {
            sum += shapes[i].area();
        }

        System.out.println("\nAll figures sum of area is "  +
                String.format(ObjInfo.doubleFormat(), sum));
    }
}
