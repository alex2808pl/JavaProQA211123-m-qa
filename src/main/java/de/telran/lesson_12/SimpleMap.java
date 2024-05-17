package de.telran.lesson_12;

import java.util.*;

public class SimpleMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new TreeMap<>(); // данные храняться в отсортированном виде
        System.out.println(map1.put(2, "Наша 2")); // добавление возвращает null
        System.out.println(map1.put(1, "Наша 1"));
        System.out.println(map1);
        System.out.println(map1.put(1, "Наша новая 1")); //изменение данных, возвращает предыдущее значение value
        System.out.println(map1);
        // null
        System.out.println(map1.put(5,null)); // в value может храниться null
        System.out.println(map1);
        System.out.println(map1.put(5, "Наша 5")); // изменили value
        System.out.println(map1);
        //map1.put(null,"Наш Null"); //NullPointerException - в TreeMap ключ не может быть null
        map1.put(3, "Наша 3");
        System.out.println(map1);

        // Изменение порядка сортировки по key
        Map<Integer, String> map2 = new TreeMap<>(Comparator.reverseOrder());
        System.out.println(map2.put(2, "Наша 2")); // добавление возвращает null
        System.out.println(map2.put(1, "Наша 1"));
        System.out.println(map2.put(5, "Наша 5"));
        map2.put(3, "Наша 3");
        System.out.println(map2);

        // просматриваем пару ключ - значение
        for(Map.Entry<Integer, String> el : map2.entrySet()) {
            System.out.println(el.getKey()+" = "+el.getValue());
        }

        System.out.println("Ключи:");
        for (Integer key : map2.keySet()) {
            System.out.println(key);
        }

        System.out.println("Значения:");
        for (String val : map2.values()) {
            System.out.println(val);
        }

        // Поиск
        System.out.println("Поиск:");
        System.out.println("1 -> "+map2.get(1)); // ищем по key, возвращает value
        System.out.println("4 -> "+map2.get(4)); // не находим, возвращает null
        // если есть элемент, у которого value = null, то get нельзя использовать
        System.out.println("containsKey 1 :"+map2.containsKey(1));
        System.out.println("containsKey 4 :"+map2.containsKey(4));
        System.out.println("containsValue 1 :"+map2.containsValue("Наша 1"));
        System.out.println("containsValue 4 :"+map2.containsValue("Наша 4"));

        //Удаление объекта
        System.out.println("Удаление по ключу:");
        System.out.println("1 -> "+map2.remove(1)); // ищем по key, возвращает value удаленного элемента
        System.out.println("4 -> "+map2.remove(4)); // не находим, возвращает null
        System.out.println(map2);
        System.out.println("Удаление по ключу и значению:");
        System.out.println("3 -> "+map2.remove(3, "Другой")); // false - ключ и значение не совпали
        System.out.println(map2);
        System.out.println("3 -> "+map2.remove(3, "Наша 3")); // true - ключ и значение совпали
        System.out.println(map2);

        System.out.println("Size="+map2.size()+" , isEmpty()="+map2.isEmpty());

        // HashMap - порядок хранения объектов не гарантируется
        Map<Integer, String> map3 = new HashMap<>();
        System.out.println(map3.put(2, "Наша 2")); // добавление возвращает null
        System.out.println(map3.put(1, "Наша 1"));
        // null
        System.out.println(map3.put(5,null)); // в value может храниться null
        map3.put(3, "Наша 3");
        System.out.println("HashMap="+map3);
        map3.put(17, "Наша 17");
        System.out.println("HashMap="+map3);
        map3.put(null,"Наш Null");
        System.out.println("HashMap="+map3); // в HashMap могут быть key=null

        // LinkedHashMap - порядок хранения объектов по истории добавления
        map3 = new LinkedHashMap<>();
        System.out.println(map3.put(2, "Наша 2")); // добавление возвращает null
        System.out.println(map3.put(1, "Наша 1"));
        // null
        System.out.println(map3.put(5,null)); // в value может храниться null
        map3.put(3, "Наша 3");
        System.out.println("LinkedHashMap="+map3);
        map3.put(17, "Наша 17");
        System.out.println("LinkedHashMap="+map3);
        map3.put(null,"Наш Null");
        System.out.println("LinkedHashMap="+map3); // в LinkedHashMap могут быть key=null


    }
}
