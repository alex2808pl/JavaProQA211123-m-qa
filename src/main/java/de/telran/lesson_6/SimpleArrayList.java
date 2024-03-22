package de.telran.lesson_6;

import java.util.ArrayList;
import java.util.List;

public class SimpleArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1,11);
        System.out.println(list);

        List<Integer> list2 = List.of(33,44,55,77);
        System.out.println(list2);

        list.addAll(list2); // добавление коллекции в конец
        System.out.println(list);

        list.addAll(2, list2); // вставка коллекции по индексу
        System.out.println(list);

        // Изменение данных
        list.set(1, 999);
        System.out.println(list);

        // Удалить
        list.remove(1); // по индексу
        System.out.println(list);

        list.remove(Integer.valueOf(77)); // object удаляет первое найденное значение
        System.out.println(list);

        list.add(55);
        System.out.println(list);
        list.removeAll(list2); // сравнивает значение каждого элемента подмассива и удаляет все встречающие
        System.out.println(list);

        // Получить данные
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // Перебор данных в коллекции с получением элементов


        // вывод в прямом порядке
        for (int i = 0; i < list.size(); i++) { //по индексу
            System.out.print(list.get(i)+",");
        }
        System.out.println();

        // вывод в обратном порядке
        for (int i = list.size()-1; i >= 0; i--) { //по индексу
            System.out.print(list.get(i)+",");
        }
        System.out.println();

        // вывод в прямом порядке
        for(Integer el : list) { // c помощью Iterator
            System.out.print(el+",");
        }
        System.out.println();

        //поиск
        System.out.println(list.contains(Integer.valueOf(20)));
        System.out.println(list.contains(Integer.valueOf(11)));
        System.out.println(list.containsAll(List.of(20,30)));
        System.out.println(list.containsAll(List.of(10,30))); // логика работает по &&
        System.out.println(list.containsAll(List.of(10,55))); // логика работает по &&
    }
}
