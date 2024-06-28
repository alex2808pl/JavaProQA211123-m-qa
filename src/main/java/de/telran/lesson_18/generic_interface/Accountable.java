package de.telran.lesson_18.generic_interface;

public interface Accountable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
