package de.telran.lesson_11;

import java.util.*;

public class SimplePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        // добавляем
        queue1.add("Петя");
        queue1.add("Гриша");
        queue1.add("Вася");
        queue1.add("Дуняша");
        System.out.println("Добавляем add - "+queue1.add("Светлана"));
        System.out.println(queue1);

        System.out.println("Просмотр кто первый - "+queue1.element());
        while(!queue1.isEmpty()) {
            System.out.print(queue1.remove()+",");
        }
        System.out.println();

        queue1 = new PriorityQueue<>(Comparator.reverseOrder());
        queue1.add("Петя");
        queue1.add("Гриша");
        queue1.add("Вася");
        queue1.add("Дуняша");
        System.out.println("Добавляем add - "+queue1.add("Светлана"));
        System.out.println(queue1);
        System.out.println("Просмотр кто первый - "+queue1.element());
        while(!queue1.isEmpty()) {
            System.out.print(queue1.remove()+",");
        }
        System.out.println();

        queue1 = new PriorityQueue<>(Comparator.naturalOrder());
        queue1.offer("Петя");
        queue1.offer("Гриша");
        queue1.offer("Вася");
        queue1.offer("Дуняша");
        System.out.println(queue1);
        System.out.println("Просмотр кто первый - "+queue1.peek());

        System.out.println("Iterator");
        Iterator<String> iterator = queue1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+",");
        }
        System.out.println();
        System.out.println(queue1);
        System.out.println("Извлекаем - poll");
        while(!queue1.isEmpty()) {
            System.out.print(queue1.poll()+",");
        }
        System.out.println();
        // Вывод
        // add, remove, element - Exception
        // offer, poll, peek - анализ ошибок по возвращаемому значение из метода

    }
}
