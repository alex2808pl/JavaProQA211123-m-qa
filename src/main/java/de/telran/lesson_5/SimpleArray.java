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

        //копирование массива
        int[] arrIntLitCopy = arrIntLit; // копирование ссылки
        arrIntLitCopy[2] = 11;
        System.out.println(Arrays.toString(arrIntLitCopy));
        System.out.println(Arrays.toString(arrIntLit));

        int[] arrIntLitClone = arrIntLit.clone(); //клонирование объекта
        arrIntLitClone[2] = 33;
        System.out.println(Arrays.toString(arrIntLitClone));
        System.out.println(Arrays.toString(arrIntLit));



    }
}
