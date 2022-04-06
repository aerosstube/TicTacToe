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

                if(currentCell.length() == 3) {
                    System.out.printf("\n│  %s  │  %s  │  %s  │\n", currentCell.charAt(0), currentCell.charAt(1), currentCell.charAt(2));

                    if(i == 2) {
                        System.out.print("└─────┴─────┴─────┘");
                    } else {
                        System.out.print("├─────┼─────┼─────┤");
                    }

                }

            }
        }
    }

    void input(int whoAreYou) {
        int playerInput = whoAreYou == 1 ? 1 : 2;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты: ");
        String[] playerInputCoords = in.nextLine().split(" ");
        in.close();

        field[Integer.parseInt(playerInputCoords[0])][Integer.parseInt(playerInputCoords[1])] = playerInput;
    }

    boolean winOrNot() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if(field[i][i] == field[i+1][i+1] && field[i+1][i+1] == field[i+2][i+2]) {
                    return true;
                }
            }
        }
        return  false;
    }

}
