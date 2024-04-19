package de.telran.lesson_8;

public class SimpleEquals {
    public static void main(String[] args) {
        Human h1 = new Human("Вася",25);
        Human h2 = h1;
        Human h3 = new Human("Вася",25);
        Human h4 = new Human("Вася",26);

        System.out.println(h1.equals(h2));

        Integer i1 = 5;
        System.out.println(h1.equals(i1)); // Human != Integer

        System.out.println(h1.equals(h3));
        System.out.println(h1.equals(h4));

        System.out.println("h1.hashCode = "+h1.hashCode());
        System.out.println("h2.hashCode = "+h2.hashCode());
        System.out.println("h3.hashCode = "+h3.hashCode());
        System.out.println("h4.hashCode = "+h4.hashCode());

    }
}
