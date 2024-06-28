package de.telran.lesson_18.generic_method;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        String[] words = {"Мама", "мыла", "раму"};
        Integer[] numbers = {1,2,3,4,5};

        printer.print(words);
        printer.print(numbers);

        printer.<String>print(words);
        printer.<Integer>print(numbers);

    }


}
