package de.telran.lesson_18.generic_class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(12345, 1000);
        var account2 = new Account(67890, 500);
        System.out.println("account1="+account1.getSum());
        System.out.println("account2="+account2.getSum());
        //IBAN
        // Account account3 = new Account("DE12345", 1000); //нельзя

        AccountObject accountObject1 = new AccountObject(12345, 1000);
        AccountObject accountObject2 = new AccountObject("DE12345", 500);
        AccountObject accountObject3 = new AccountObject(12.35, 500);
        System.out.println("accountObject1="+accountObject1.getSum());
        System.out.println("accountObject2="+accountObject2.getSum());

        System.out.println(accountObject2.getId());
        int acc = (int) accountObject1.getId();
        //acc = (int) accountObject2.getId();

        AccountGeneric accountGeneric1 = new AccountGeneric(12345, 1000); //T станет Object
        AccountGeneric<Object> accountGeneric2 = new AccountGeneric<>("DE12345", 500);//T станет Object
        //acc = (int) accountGeneric2.getId(); //опять ошибка
        accountGeneric1 = accountGeneric2; // оба элемента имеют тип AccountGeneric<Object>

        AccountGeneric<Integer> accountGeneric3 = new AccountGeneric<>(12345, 1000);//T станет Integer
        System.out.println(accountGeneric3.getId());

        AccountGeneric<String> accountGeneric4 = new AccountGeneric<>("DE12345", 500);
        //accountGeneric4 = accountGeneric3; // не работает, потому что AccountGeneric<Integer> = AccountGeneric<String> не одиноковы


        // Это напоминает

        List listObj = new ArrayList<>(); // не рекомендуемый принцип создания
        listObj.add(1);
        listObj.add("1111");

        // должно быть так
        List<Integer> list = new ArrayList<>(); // только цифры
        list.add(111);

        List<String> listStr = new ArrayList<>(); // только строки
        listStr.add("111");

        // Два шаблонных параметра
        AccountTwoGeneric<String, Double> accountTwoGeneric = new AccountTwoGeneric<>("DE12345", 123.0);
        System.out.println("до accountTwoGeneric.sum = "+accountTwoGeneric.getSum());
        accountTwoGeneric.setSum(accountTwoGeneric.getSum()+1000);
        System.out.println("после accountTwoGeneric.sum = "+accountTwoGeneric.getSum());
        // однотипные шаблонны
        AccountTwoGeneric<Integer, Integer> accountTwoGeneric1 = new AccountTwoGeneric<>(12345, 1000);

        // это похоже на
        Map<Integer, String> map = new HashMap<>();




    }
}
