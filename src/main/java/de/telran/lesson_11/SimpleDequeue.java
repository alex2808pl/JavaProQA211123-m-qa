package de.telran.lesson_11;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleDequeue {
    public static void main(String[] args) {
        Deque<String> deque1 = new ArrayDeque<>();
        System.out.println("=== LIFO ===");
        // LIFO
        deque1.push("Вася");
        deque1.push("Петя");
        deque1.push("Гриша");
        deque1.push("Дуняша");
        System.out.println(deque1);

        System.out.println("Первый на выход = "+deque1.peek());
        System.out.println(deque1);

        System.out.println("Извлекаем элемент = "+deque1.pop());
        System.out.println(deque1);

        deque1.clear();

        System.out.println("=== FIFO ===");
        //FIFO
        deque1.offer("Вася");
        deque1.offer("Петя");
        deque1.offer("Гриша");
        deque1.offer("Дуняша");
        System.out.println(deque1);

        System.out.println("Первый на выход = "+deque1.peek());
        System.out.println(deque1);

        System.out.println("Извлекаем элемент = "+deque1.poll());
        System.out.println(deque1);

        //Альтернативный подход
        deque1.clear();
        System.out.println("=== LIFO ===");
        // LIFO
        deque1.addFirst("Вася");
        deque1.addFirst("Петя");
        deque1.addFirst("Гриша");
        deque1.addFirst("Дуняша");
        System.out.println(deque1);

        System.out.println("Извлекаем элемент = "+deque1.removeFirst());
        System.out.println(deque1);

        deque1.clear();

        System.out.println("=== FIFO ===");
        //FIFO
        deque1.addLast("Вася");
        deque1.addLast("Петя");
        deque1.addLast("Гриша");
        deque1.addLast("Дуняша");
        System.out.println(deque1);

        System.out.println("Извлекаем элемент = "+deque1.removeFirst());
        System.out.println(deque1);
    }
}
