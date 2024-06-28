package de.telran.lesson_18.generic_class;

public class AccountGeneric <T>  {
    private T id;
    private int sum;

    public AccountGeneric(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "AccountGeneric{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }
}
