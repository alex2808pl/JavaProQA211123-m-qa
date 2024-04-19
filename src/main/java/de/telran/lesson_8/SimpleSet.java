package de.telran.lesson_8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SimpleSet {
    public static void main(String[] args) {
        // TreeSet - осортированный вид хранения
        Set<Integer> setTree = new TreeSet<>();
        setTree.add(5);
        setTree.add(1);
        setTree.add(8);
        setTree.add(4);
        System.out.println(setTree.add(20));
        System.out.println(setTree.add(8)); // дубликат возвращает false
        System.out.println("setTree -> "+setTree);

        //LinkedHashSet - сохраняется история добавление
        Set<Integer> setLinked = new LinkedHashSet<>();
        setLinked.add(5);
        setLinked.add(1);
        setLinked.add(8);
        setLinked.add(4);
        System.out.println(setLinked.add(20));
        System.out.println(setLinked.add(8)); // дубликат возвращает false
        System.out.println("setLinked -> "+setLinked);

        // HashSet - информация храниться согласно хэшкоду
        Set<Integer> setHash = new HashSet<>();
        setHash.add(5);
        setHash.add(1);
        setHash.add(8);
        setHash.add(4);
        System.out.println(setHash.add(20));
        System.out.println(setHash.add(8)); // дубликат возвращает false
        System.out.println("setHash -> "+setHash);
    }
}
