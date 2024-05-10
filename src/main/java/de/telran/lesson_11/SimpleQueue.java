package de.telran.lesson_11;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {
    public static void main(String[] args) {
        Queue<String> queue1 = new LinkedList<>();
        // добавляем
        queue1.add("Вася");
        queue1.add("Петя");
        queue1.add("Гриша");
        queue1.add("Дуняша");
        System.out.println("Добавляем add - "+queue1.add("Светлана"));
        System.out.println(queue1);
        // Алгоритмическое добавляение offer/pool/peek
        System.out.println("Добавляем offer - "+queue1.offer("Михаил"));
        System.out.println(queue1);

        //просмотр информации
        System.out.println("Просмотр peek - "+queue1.peek());
        System.out.println("Просмотр element - "+queue1.element());
        System.out.println(queue1);

        //извлечение из очереди
        System.out.println("Извлечение poll - "+queue1.poll());
        System.out.println("Извлечение remove - "+queue1.remove());
        System.out.println(queue1);

        // Вывод
        // add, remove, element - Exception
        // offer, poll, peek - анализ ошибок по возвращаемому значение из метода
        Queue<String> queue2 = new LinkedList<>();
        System.out.println(queue2);
//        System.out.println("Просмотр element - "+queue2.element());
//        System.out.println("Извлечение remove - "+queue2.remove());
        System.out.println("Просмотр peek - "+queue2.peek());
        System.out.println("Извлечение poll - "+queue2.poll());
    }
}
