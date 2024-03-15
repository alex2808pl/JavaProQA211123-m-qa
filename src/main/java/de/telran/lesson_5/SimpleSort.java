package de.telran.lesson_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleSort {
    public static void main(String[] args) {
        int[] arrIntLit = {1,5,7,3,9,4,8};
        System.out.println(Arrays.toString(arrIntLit));
        // 1) Пузырек - циклический поиск
        // 2) Arrays.sort
        Arrays.sort(arrIntLit);
        System.out.println(Arrays.toString(arrIntLit));

        // 3) Collections.sort - работает только с List
        //Collections.sort(...);


     }
}
