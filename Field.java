package com.lesson;

public class Field {

    private static final int FIELD_SIZE = 3;

    private static final char DEFAULT_CELL_VALUE = ' ';

    private char[][] field = new char[DEFAULT_CELL_VALUE][DEFAULT_CELL_VALUE];

    public void eraseField() {
        for (int j = 0; j < FIELD_SIZE; j++) {
            eraseLine(j);
        }
    }

    public void showField() {
        for (int j = 0; j < FIELD_SIZE; j++) {
            showLine(j);
        }
    }

    private void eraseLine(int lineNumber) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            field[i][lineNumber] = DEFAULT_CELL_VALUE;
        }
    }

    private void showLine(int lineNumber) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            System.out.print("[" + field[i][lineNumber] + "]");
        }
        System.out.println();
    }
}

/*  0  1  2
0  [ ][ ][ ]
1  [ ][ ][ ]
2  [ ][ ][ ]
 */
