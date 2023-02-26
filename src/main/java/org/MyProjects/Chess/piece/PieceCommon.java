package org.MyProjects.Chess.piece;

import org.MyProjects.Chess.Coordinate;

public abstract class PieceCommon implements Piece {

    protected char whiteSymbol = 'x';
    protected char blackSymbol = 'x';
    private final PieceColorType colorType;
    private Coordinate coordinate;

    public PieceCommon(PieceColorType colorType) {
        this.colorType = colorType;
    }

    public abstract int[][] getMoveMap();

    public char draw() {
        switch (colorType) {
            case BLACK:
                return blackSymbol;
            case WHITE:
            default:
                return whiteSymbol;
        }
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
