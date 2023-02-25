package org.OOP.Extend.FiguteTask;

public abstract class Figure {


    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Area is: " + getArea() +
                ", Perimeter is: " + getPerimeter();
    }
}
