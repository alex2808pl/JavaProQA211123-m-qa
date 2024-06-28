package de.telran.lesson_18.generic_class;

public class AccountTwoGeneric<T,U> {
    private T id;
    private U sum;

    public AccountTwoGeneric(T id, U sum) {
        this.id = id;
        this.sum = sum;
    }

    public void setSum(U sum) {
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public U getSum() {
        return sum;
    }
}
