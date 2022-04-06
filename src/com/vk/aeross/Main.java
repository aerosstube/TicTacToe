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

        while (true) {
            field.drawField();

            Scanner in = new Scanner(System.in);
            System.out.println("\nВведите координаты: ");

            String input = in.nextLine();
            String[] playerInputCoords = input.split(" ");


            in.close();

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
