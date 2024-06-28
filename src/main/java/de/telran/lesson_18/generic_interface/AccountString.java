package de.telran.lesson_18.generic_interface;

public class AccountString implements Accountable<String>{
    private String id;
    private int sum;

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public int getSum() {
        return this.sum;
    }

    @Override
    public void setSum(int sum) {
        this.sum += sum;
    }

    public AccountString(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }
}
