package org.OOO.Extend.FiguteTask;

public class Triangle extends Figure {

    //    private TriangleType triangleType;
    private double a;
    private double b;
    private double c;


    public Triangle(TriangleType triangleType, double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public double getArea() {
        return Math.sqrt(semiperimeter() * (semiperimeter() - a) *
                (semiperimeter() - b) * (semiperimeter() - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public double semiperimeter() {
        return (a + b + c) / 2;
    }
}
