package de.telran.lesson_18.restrictions;
// U extends Number - я и мои наследники
// U super Number - мои предки

public class AccountTwoGeneric<T, U extends Number> {
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

//    public U addSum(U addSum) {
//        this.sum += addSum;
//        return this.sum;
//    }
}
