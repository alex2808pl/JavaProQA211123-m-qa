package de.telran.lesson_18.generic_method;

public class Printer {

    // строки
    public void print(String[] items) {
        for (String item : items) {
            System.out.println(item);
        }
    }

    //числа
    public void print(Integer[] items) {
        for (Integer item : items) {
            System.out.println(item);
        }
    }

    // Generic метод
    public <T> void print(T[] items) {
        for (T item : items) {
            System.out.println(item);
        }
    }

}
