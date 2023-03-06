package org.TrainingInFreeTime.Kata.Kata_03_01.Figures.Figures;

import org.TrainingInFreeTime.Kata.Kata_03_01.Figures.info.ObjInfo;

public class Circle implements Shape, Info{
    private final double r;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double area() {
        return Math.PI * r * r;
    }
    @Override
    public void print() {
        System.out.printf(ObjInfo.printFormat(), toString(), objArea());
    }

    @Override
    public String objArea() {
        return " \u001B[33mCircle area is " + String.format(ObjInfo.doubleFormat(), area());
    }



    @Override
    public String toString() {
        return "\u001B[37mCircle{" +
                "r=" + String.format(ObjInfo.doubleFormat(), r) +
                '}';
    }


}
