package com.lesson;

public class Field {

    private static final int DEFAULT_FIELD_SIZE = 4;

    private static final int MIN_FIELD_SIZE = 0;

    private static final int MAX_FIELD_SIZE = 100;

    private static final char DEFAULT_CELL_VALUE = ' ';

    private int fieldSize;

    private char[][] field;

    public Field() {
        this(DEFAULT_FIELD_SIZE);
        System.out.println("In constructor");
    }

    public Field(int size) {
        fieldSize = size;
        field = new char[fieldSize][fieldSize];
    }

    //private static final int fieldSize = 3;

//    public void setFieldSize(int newFieldSize) {
//        if (newFieldSize > MIN_FIELD_SIZE && newFieldSize < MAX_FIELD_SIZE) {
//            fieldSize = newFieldSize;
//            }
//    }

    public int getFieldSize() {
        return fieldSize;
    }

    public void eraseField() {
        for (int j = 0; j < fieldSize; j++) {
            eraseLine(j);
        }
    }

    public void showField() {
        System.out.println();
        for (int j = 0; j < fieldSize; j++) {
            showLine(j);
        }
        System.out.println();
    }

    private void eraseLine(int lineNumber) {
        for (int i = 0; i < fieldSize; i++) {
            field[i][lineNumber] = DEFAULT_CELL_VALUE;
        }
    }

    private void showLine(int lineNumber) {
        for (int i = 0; i < fieldSize; i++) {
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
