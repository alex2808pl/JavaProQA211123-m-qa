package de.telran.lesson_7;

import java.util.LinkedList;
import java.util.List;

public class SimpleLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        // добавление в конец (хвост)
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(9);

        list.addLast(7); //равнозначный с add c 21

        System.out.println(list);

        // вставить элемент
        list.add(2, 10);

        System.out.println(list);

        // вставка в начало
        list.addFirst(11); //равнозначный с add c 21
        list.add(0,13);
        System.out.println(list);

        /// -- Удаление элементов ---

        // Удаляем с головы
        System.out.println(list.remove(0)); // удаление по индексу
        System.out.println(list);

        System.out.println(list.removeFirst()); // альтернативный метод
        System.out.println(list);

        // Удаляем с хвоста
        System.out.println(list.removeLast());
        System.out.println(list);

        System.out.println(list.remove(list.size()-1)); // удаление по индексу
        System.out.println(list);


        // Удалить с середины
        System.out.println(list.remove(2)); // удаление по индексу
        System.out.println(list);

        //Универсальный удалитель :)
        // Удаление по значению
        System.out.println(list.remove(Integer.valueOf(8))); // только для Integer, т.к. компилятор путается
        //для строк list.remove("Мама");
        System.out.println(list);

        //Извлечение информации
        System.out.println(list.get(1));
        System.out.println(list.getFirst()); // c 21 версии Java
        System.out.println(list.getLast());// c 21 версии Java

        // Изменение информации
        System.out.println("Старое значение = "+list.set(1, 33));
        System.out.println(list);

        //---- Дополнительный метод

        // Поиск информации
        System.out.println(list.contains(5));
        System.out.println(list.contains(10));
        if(list.contains(5)) {
            System.out.println("Число найдено!");
        }
        else {
            System.out.println("Число не найдено!");
        }

        // Очистка
        list.clear();
        System.out.println(list);

    }
}
