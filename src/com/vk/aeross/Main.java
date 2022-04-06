package com.vk.aeross;

public class Main {
    public static void main(String[] args) {
        int[][] fieldD = {
                {1,0,0},
                {0,1,0},
                {0,0,0}
        };

        Field field = new Field(fieldD);

        field.drawField();

        System.out.println(field.winOrNot());
    }


}
