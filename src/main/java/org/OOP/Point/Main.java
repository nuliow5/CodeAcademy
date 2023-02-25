package org.OOP.Point;

public class Main {
    public static void main(String[] args) {
        Point firstPoint = new Point(10, 5);
        Point lastPoint = new Point(5, 10);
        firstPoint.print();
        lastPoint.print();


        System.out.println("\n-------DATA FROM USER--------");
        // Segment
        Segment segment = new Segment();

        segment.inputFirstAndLastPointCoordinate(1,2,3,4);
        segment.printBothPoint();


        segment.printCalculation();

        System.out.println("\n----------RANDOM-------------");
        //random
        segment.inputFirstAndLastPointCoordinate();
        segment.printBothPoint();
        segment.printCalculation();

    }
}
