package de.telran.lesson_11;

import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {
        // LIFO
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(6);
        stack1.push(1);
        stack1.push(8);
        stack1.push(5);
        stack1.push(3);
        System.out.println("Добавялем push - "+stack1.push(9));
        System.out.println(stack1);

        System.out.println("Первый на выход = "+stack1.peek());
        System.out.println(stack1);

        System.out.println("Извлекаем элемент = "+stack1.pop());
        System.out.println(stack1);

        System.out.println("Первый на выход = "+stack1.peek());
        System.out.println(stack1);

        System.out.println("Добавляем add - "+stack1.add(0));
        System.out.println(stack1);

        System.out.println("Первый на выход = "+stack1.peek());
        System.out.println(stack1);

        System.out.println("Search = "+stack1.search(8));

    }

}
