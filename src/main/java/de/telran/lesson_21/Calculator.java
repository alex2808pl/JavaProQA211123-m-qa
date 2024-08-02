package de.telran.lesson_21;

public class Calculator {
    public int add(int a1, int a2) {
        return a1+a2;
    }

    public int substract(int a1, int a2) {
        return a1-a2;
    }

    public int divide(int a1, int a2) {
        if(a2==0) {
            throw new NullPointerException("Второй параметр не должен быть 0!");
        }
        return a1 / a2;
    }
}
