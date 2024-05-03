package de.telran.lesson_10;

import java.util.*;

public class SimpleCollection {
    public static void main(String[] args) {
        System.out.println("== ArrayList ==");
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,8,5,6,3));
        arr.add(10);
        System.out.println(arr);
        // Работаем с индексом
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) >= 5) { //какое-то условие
                System.out.println("arr["+i+"]="+arr.get(i));
            }
        }
        // Работаем с iterator
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            Integer val = iterator.next();
            if(val >= 5) { //какое-то условие
                System.out.println("arr = "+val);
            }
            if(val==3) {
                iterator.remove();
            }
        }
        System.out.println(arr);

        // Работаем с foreach
        for (Integer val : arr) {
            if(val >= 5) { //какое-то условие
                System.out.println("arr (foreach) = "+val);
            }
        }

        System.out.println("== LinkedList ==");
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1,2,3,8,5,6,3));
        linkedList.add(10);
        System.out.println(linkedList);
        for (int i = 0; i < linkedList.size(); i++) {
            if(linkedList.get(i) >= 5) { //какое-то условие
                System.out.println("linkedList["+i+"]="+linkedList.get(i));
            }
        }
        // Работаем с iterator
        iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Integer val = iterator.next();
            if(val >= 5) { //какое-то условие
                System.out.println("linkedList = "+val);
            }
            if(val==3) {
                iterator.remove();
            }
        }
        System.out.println(linkedList);

        // Работаем с foreach
        for (Integer val : linkedList) {
            if(val >= 5) { //какое-то условие
                System.out.println("linkedList (foreach) = "+val);
            }
        }

        System.out.println("== HashSet ==");
        HashSet<Integer> hashSet = new HashSet<>(List.of(1,2,3,8,5,6,3));
        hashSet.add(10);
        System.out.println(hashSet);
        // Работаем с iterator
        iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Integer val = iterator.next();
            if(val >= 5) { //какое-то условие
                System.out.println("hashSet ="+val);
            }
            if(val==3) {
                iterator.remove();
            }
        }
        System.out.println(hashSet);
        // Работаем с foreach
        ArrayList<Integer> newArr = new ArrayList<>();
        for (Integer val : hashSet) {
            if(val >= 5) { //какое-то условие
                System.out.println("hashSet (foreach) = "+val);
                newArr.add(val); //в другую коллекцию, например, добавлять можно.
                //hashSet.remove(val); // нельзя менять коллекцию (ConcurrentModificationException)
             }
        }
        System.out.println(hashSet);
        System.out.println("Новая коллекция -- "+newArr);
        // Такой подход нельзя использовать с Set
//        for (int i = 0; i < hashSet.size(); i++) {
//            if(hashSet.get(i) >= 5) { //какое-то условие
//                System.out.println("hashSet["+i+"]="+hashSet.get(i));
//            }
//        }

    }
}
