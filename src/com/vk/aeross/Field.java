package com.vk.aeross;

import java.util.Scanner;

public class Field {
    private final int fieldSizeX = 3;
    private final int fieldSizeY = 3;
    private int[][] field = new int[fieldSizeX][fieldSizeY];

    public Field(int[][] field) {
        this.field = field;
    }

    private final String xSymbol = "×";
    private final String zeroSymbol = "●";

    void drawTable(StringBuilder currentCell, int i) {
        if(currentCell.length() == 3) {
            System.out.printf("\n│  %s  │  %s  │  %s  │\n", currentCell.charAt(0), currentCell.charAt(1), currentCell.charAt(2));

            if(i == 2) {
                System.out.print("└─────┴─────┴─────┘");
            } else {
                System.out.print("├─────┼─────┼─────┤");
            }

        }
    }

    public void drawField() {
        System.out.print("┌─────┬─────┬─────┐");

        for (int i = 0; i < field.length; i++) {
            StringBuilder currentCell = new StringBuilder();
            for (int j = 0; j < field[i].length; j++) {

                if(field[i][j] == 1) {
                    currentCell.append(zeroSymbol);
                } else if(field[i][j] == 2) {
                    currentCell.append(xSymbol);
                } else {
                    currentCell.append(" ");
                }

                drawTable(currentCell, i);
            }
        }
    }


    void input(int whoAreYou, int x, int y) {
        int playerInput = whoAreYou == 1 ? 1 : 2;

        if(field[x][y] == 0 ) {
            field[x][y] = playerInput;
        } else {
            System.out.println("Вы не можете переназначить занчиние!");
        }

    }

    boolean winOrNot() {
        return ((field[0][0] == field[1][1] && field[1][1] == field[2][2]) && (field[0][0] != 0 && field[1][1] != 0 && field[2][2] != 0))
                || ((field[0][2] == field[1][1] && field[1][1] == field[2][0]) && (field[0][2] != 0 && field[1][1] != 0 && field[2][0] != 0))
                || ((field[0][0] == field[1][0] && field[1][0] == field[2][0]) && (field[0][0] != 0 && field[1][0] != 0 && field[2][0] != 0))
                || ((field[0][2] == field[1][2] && field[1][2] == field[2][2]) && (field[0][2] != 0 && field[1][2] != 0 && field[2][2] != 0))
                || ((field[0][0] == field[0][1] && field[0][1] == field[0][2]) && (field[0][0] != 0 && field[0][1] != 0 && field[0][2] != 0))
                || ((field[2][0] == field[2][1] && field[2][1] == field[2][2]) && (field[2][0] != 0 && field[2][1] != 0 && field[2][2] != 0));
    }

}
