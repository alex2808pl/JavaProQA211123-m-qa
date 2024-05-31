package de.telran.lesson_14;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleTax {
    public static void main(String[] args) {
        List<Integer> list = List.of(500, 1000, 1500, 400, 350, 1200, 1500);
        // Налоги с сумм более 1000 євро
        List<Integer> taxSum  = new ArrayList<>();

        // filter
        for (Integer el : list) {
            if(el >= 1000) {
                taxSum.add(el);
            }
        }

        List<Double> taxes  = new ArrayList<>();
        // преобразование
        for (int i = 0; i < taxSum.size(); i++) {
            taxes.add(taxSum.get(i) * 0.4);
        }

        // суммирование
        double allSumTax = 0;
        for (Double tax : taxes) {
            allSumTax+=tax;
        }
        System.out.println("Нам нужно заплатить налогов = "+allSumTax);


        allSumTax = list.stream()  // данные обрабатываются последовательно
                .filter(el -> el>=1000)
                .mapToDouble(el -> el * 0.4)
                .sum(); // результат обработки - число

        allSumTax = list.parallelStream() // данные обрабатываются паралельно
                .filter(el -> el>=1000)
                .mapToDouble(el -> el * 0.4)
                .sum(); // результат обработки - число

        list.stream()
                .filter(el -> el>=1000)
                .mapToDouble(el -> el * 0.4)
                .forEach(System.out::println); // результат обработки - вывод на экран
//                .forEach(d -> {
//                    if (getClass() == PrintStream.class) {
//                        writeln(String.valueOf(x));
//                    } else {
//                        synchronized (this) {
//                            print(x);
//                            newLine();
//                        }
//                }});

        System.out.println(list.stream()
                .filter(el -> el >= 1000)
                .map(el -> el * 0.4)
                .collect(Collectors.toList())); // результат обработки - коллекция


        System.out.println("Нам нужно заплатить налогов (stream) = "+allSumTax);

        String str = "Мама мыла раму!";
        // строки как stream
        System.out.println(" В строке буква 'а' встречается - "+
                str.chars()
                .mapToObj(i -> (char) i)
                .filter(s -> s == 'а')
                .count()
        );


    }
}
