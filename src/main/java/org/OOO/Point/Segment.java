package org.OOO.Point;

import java.util.Random;

public class Segment {
    private Point p1 = new Point();
    private Point p2 = new Point();

    public void inputFirstAndLastPointCoordinate(double fistX, double firstY, double lastX, double lastY) {
        p1.setX(fistX);
        p1.setY(firstY);

        p2.setX(lastX);
        p2.setY(lastY);

    }

    public void inputFirstAndLastPointCoordinate() {
        Random random = new Random();
        int range = 20;
        p1.setX(range * random.nextDouble());
        p1.setY(range * random.nextDouble());

        p2.setX(range * random.nextDouble());
        p2.setY(range * random.nextDouble());

    }

    public void printBothPoint() {
        System.out.printf("[(%s, %s), (%s, %s)]\n", p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    public double segmentLengthCalculation() {
        //sum = https://www.omnicalculator.com/math/length-of-a-line-segment
        double leftMinus = p2.getX() - p1.getX();
        double rightMinus = p2.getY() - p1.getY();

        double sum = Math.sqrt((leftMinus * leftMinus) + (rightMinus * rightMinus));

        return sum;
    }

    public void printCalculation() {
        System.out.println("Length is = " + segmentLengthCalculation());
    }


}
