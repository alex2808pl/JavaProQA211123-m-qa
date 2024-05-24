package de.telran.lesson_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.*;

public class SimpleStandartInt {
    public static void main(String[] args) {
        // -- void accept(T t);
        Consumer<String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("Мама мыла раму!!!");

        stringConsumer = System.out::println; //ссылка на метод
        stringConsumer.accept("Мама мыла раму!!!");

        // -- boolean test(T t);
        Predicate<Integer> predicate = t -> t>0; // return t>0;
        if(predicate.test(10))
            System.out.println("Тепло");
        else
            System.out.println("Холодно");

        // -- R apply(T t);
        Function<Integer, String> function = integer -> "Мы получили число = "+integer;
        System.out.println(function.apply(2));

        function = count -> {
            String res = "";
            for (int j = 0; j < count; j++) {
                res += "!";
            }
            return res;
        };
        System.out.println(function.apply(10));

        // -- R apply(T t, U u);
        BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> a+b;
        System.out.println("BiFunction = "+biFunction.apply(20,10));

        // --  T get();
        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };
        System.out.println("Supplier (случайное число до 100)= "+supplier.get());
    }
}
