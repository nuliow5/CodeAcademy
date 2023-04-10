package org.MyProjects.Chess.piece.knight;

import org.MyProjects.Chess.piece.PieceColorType;
import org.MyProjects.Chess.piece.PieceCommon;

public class Knight extends PieceCommon{
    private static final char SYMBOL_BLACK = '♞';
    private static final char SYMBOL_WHITE = '♘';

    public Knight(PieceColorType colorType) {
        super(colorType);

    }

    @Override
    public int[][] getMoveMap() {
        return new int[0][];
    }



}
