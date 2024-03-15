package de.telran.lesson_5;

import java.util.Arrays;

public class SimpleMultiArray {
    public static void main(String[] args) {
        int[][] arrInt;
        arrInt = new int[2][3];
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.deepToString(arrInt));

        arrInt[0][1] = 5; //присвоение
        arrInt[1][2] = 10; //присвоение
        System.out.println(Arrays.deepToString(arrInt));
    }
}
