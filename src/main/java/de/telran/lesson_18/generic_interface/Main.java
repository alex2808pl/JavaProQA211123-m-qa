package de.telran.lesson_18.generic_interface;

public class Main {
    public static void main(String[] args) {

        // стратегия создания Generic классов при имплементации Generic интерфейсов
        Accountable<String> accountable = new Account<>("DE12345", 1000);
        System.out.println(accountable.getSum());


        Account<Integer> account = new Account<>(12345, 500);
        System.out.println(account.getSum());
        System.out.println(account.addSum(1000));

        // стратегия создания обычных классов при имплементации Generic интерфейсов с передачей конкретного типа в универсальный параметр
        AccountString accountString = new AccountString("DE123450", 2000);
        System.out.println(accountString.getSum());

        Accountable<String> accountableString = new AccountString("DE67890", 700);
        System.out.println(accountableString.getSum());

        AccountInteger accountInteger = new AccountInteger(12345, 54321);
        System.out.println(accountInteger.getId() + " = " + accountInteger.getSum());

        Accountable<Integer> accountableInteger = new AccountInteger(67890, 9876);
        System.out.println(accountableInteger.getSum());


    }
}
