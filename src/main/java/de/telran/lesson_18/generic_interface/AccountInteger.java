package de.telran.lesson_18.generic_interface;

public class AccountInteger implements Accountable<Integer>{
    private Integer id;
    private int sum;

    @Override
    public Integer getId() {
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

    public AccountInteger(Integer id, int sum) {
        this.id = id;
        this.sum = sum;
    }
}
