package de.telran.lesson_18.restrictions;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // по нашему бизнес процессу сумма не может быть строкой
        // AccountTwoGeneric<Integer, String> accountTwoGeneric1 = new AccountTwoGeneric<>(12345, "укееен");

        AccountTwoGeneric<String, Integer> accountTwoGeneric = new AccountTwoGeneric<>("DE12345", 1000);
        System.out.println(accountTwoGeneric.getSum());

        AccountTwoGeneric<String, Number> accountTwoGeneric2 = new AccountTwoGeneric<>("DE12345", 111L);
        System.out.println(accountTwoGeneric2.getSum());

    }
}
