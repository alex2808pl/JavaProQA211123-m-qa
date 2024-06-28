package de.telran.lesson_18.restrictions;

public class Main {
    public static void main(String[] args) {
        AccountTwoGeneric<String, Integer> accountTwoGeneric = new AccountTwoGeneric<>("DE12345", 1000);
        System.out.println(accountTwoGeneric.getSum());

        AccountTwoGeneric<String, Number> accountTwoGeneric2 = new AccountTwoGeneric<>("DE12345", 111L);
        System.out.println(accountTwoGeneric2.getSum());

    }
}
