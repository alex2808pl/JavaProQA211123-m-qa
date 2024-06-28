package de.telran.lesson_18.generic_interface;

public class Account<T> implements Accountable<T>{
    private T id;
    private int sum;

    @Override
    public T getId() {
        return this.id;
    }

    @Override
    public int getSum() {
        return this.sum;
    }

    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }

    public Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public int addSum(int addSum) {
        this.sum += addSum;
        return this.sum;
    }
}
