package org.MyProjects.Chess.board;

public class BoardConstants {
    static final String DIGIT = "87654321";

    static final String LETTER = "ABCDEFGH";

    static final char SPACE = ' ';

    // below char are from https://www.codetable.net/unicodecharacters?page=33
    static final char IDEOGRAPHIC_NUMBER_ZERO = '〇'; //code: 12295

    static final char IDEOGRAPHIC_SPACE = '　';  // code 12288;

    static final char CELL = IDEOGRAPHIC_SPACE; // for test purpose change into IDEOGRAPHIC_NUMBER_ZERO

    static final String TOP_LETTERS_WITH_BORDER =
            "　　A　B　C　D　E　F　G　H\n" +
                    " ╔══════════════════════╗";
    static final char BORDER_VERTICAL = '║';

    static final String BOTTOM_LETTERS_WITH_BORDER =
            " ╚══════════════════════╝\n" +
                    "　　A　B　C　D　E　F　G　H";
}
