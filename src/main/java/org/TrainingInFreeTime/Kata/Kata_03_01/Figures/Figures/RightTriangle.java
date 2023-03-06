package org.TrainingInFreeTime.Kata.Kata_03_01.Figures.Figures;

import org.TrainingInFreeTime.Kata.Kata_03_01.Figures.info.ObjInfo;

public class RightTriangle implements Shape, Info{

    private final double length;
    private final double height;

    public RightTriangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double area() {
        return length * height;
    }

    @Override
    public void print() {
        System.out.printf(ObjInfo.printFormat(), toString(), objArea());
    }

    @Override
    public String objArea() {
        return " \u001B[33mTriangle area is " + String.format(ObjInfo.doubleFormat(), area());
    }

    @Override
    public String toString() {
        return "\u001B[37mRightTriangle{" +
                "length=" + String.format(ObjInfo.doubleFormat(), length) +
                ", height=" + String.format(ObjInfo.doubleFormat(), height) +
                '}';
    }
}
