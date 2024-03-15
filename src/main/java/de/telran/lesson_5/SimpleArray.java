package de.telran.lesson_5;

import java.util.Arrays;

public class SimpleArray {
    public static void main(String[] args) {
        int[] arrInt; // в стеке выделяется память
        arrInt = new int[10]; // в куче был создан сам массив и arrInt указывает на его начало
        System.out.println(Arrays.toString(arrInt));
        arrInt[0] = 5; // присвоение значений
        arrInt[5] = 10;
        System.out.println(Arrays.toString(arrInt));

        int[] arrIntLit = {1,5,7,3,9,4,8};
        System.out.println(Arrays.toString(arrIntLit));

        int result = arrIntLit[3]; //получение значения
        System.out.println("arrIntLit[3] = "+result);
        System.out.println(arrIntLit[6]); // берем элемент с индексом 6

    }
}
