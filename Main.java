package com.lesson;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        field.showField();
        field.showField();

        field = new Field(2);
        field.showField();
        field.showField();

    }
}
