package com.vk.aeross;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] fieldD = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };

        Field field = new Field(fieldD);
        int i = 1;

        while (true) {
            field.drawField();

            Scanner in = new Scanner(System.in);
            System.out.println("\nВведите координаты: ");
            String input = in.nextLine();
            String[] playerInputCoords = input.split(" ");

            if (i == 1) {
                i += 1;
            } else {
                i -= 1;
            }

            field.input(i, Integer.parseInt(playerInputCoords[0]), Integer.parseInt(playerInputCoords[1]));

            if(input.equals("ti")) {
                break;
            }

            if (field.winOrNot()) {
                System.out.println("Победитель");
                System.exit(0);
            }


        }





    }


}
