package org.OOP.Extend.FiguteTask;

public class Circle extends Figure{
    private final double r;

    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double getArea() {
        return Math.PI * r;
    }
    @Override
    public double getPerimeter() {
        return Math.PI * r * r;
    }
}
