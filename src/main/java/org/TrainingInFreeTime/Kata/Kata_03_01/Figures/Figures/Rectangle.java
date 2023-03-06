package org.TrainingInFreeTime.Kata.Kata_03_01.Figures.Figures;

import org.TrainingInFreeTime.Kata.Kata_03_01.Figures.info.ObjInfo;

public class Rectangle implements Shape, Info {
    private final double height;
    private final double border;

    public Rectangle(double height, double border) {
        this.height = height;
        this.border = border;
    }

    @Override
    public double area() {
        return (height * border) / 2;
    }

    public String objArea(){
        return " \u001B[33mRectangle area is " +  String.format(ObjInfo.doubleFormat(), area());
    }
    @Override
    public void print() {
        System.out.printf(ObjInfo.printFormat(), toString(), objArea());
    }

    @Override
    public String toString() {
        return "\u001B[37mRectangle{" +
                "height=" + String.format(ObjInfo.doubleFormat(), height) +
                ", border=" + String.format(ObjInfo.doubleFormat(), border) +
                '}';
    }
}
