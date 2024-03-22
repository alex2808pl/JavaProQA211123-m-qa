package de.telran.lesson_6.practice;

import java.util.ArrayList;
import java.util.List;

//Возьмите список, удалите все элементы, которые не соответствуют определенным критериям.
//        вам дан список значений
//        у вас есть критерии для этих значений
//        вернуть список только с теми значениями из исходного списка, которые соответствуют этим критериям

public class Task2 {
    public static void main(String[] args) {

        List<Human> list = new ArrayList<>();

        Human human1 = new Human("Ivan", 25);
        list.add(human1);

        list.add(new Human("Petr", 38));
        list.add(new Human("Semen", 99));

        System.out.println(list);

        List<Human> list2 = List.of(
                new Human("Boris", 12),
                new Human("Mike", 4));


        System.out.println(list2);

        list.addAll(list2);//добавл коллекции в конец
        System.out.println(list);

        int i = 0;
        while (i < list.size()) {
            if (list.get(i).getAge() > 30) {
                list.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(list);

    }
}
