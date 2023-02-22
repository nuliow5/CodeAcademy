package org.OOO.Extend.FiguteTask;

public class Square extends Figure{
    private final double boarderLength;

    public Square(double boarderLength) {
        this.boarderLength = boarderLength;
    }

    @Override
    public double getArea() {
        return boarderLength * boarderLength;
    }

    @Override
    public double getPerimeter() {
        return 4 * boarderLength;
    }
}
