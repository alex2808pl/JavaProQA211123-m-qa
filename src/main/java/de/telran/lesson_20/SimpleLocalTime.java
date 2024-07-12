package de.telran.lesson_20;

import java.time.LocalTime;

public class SimpleLocalTime {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.now();
        System.out.println("Current time = "+lt1);

        LocalTime lt2 = LocalTime.of(10,10);
        System.out.println("User time = "+lt2);

        System.out.println("Sec time = "+lt1.getSecond());

        System.out.println("+ 3 hours = "+lt1.plusHours(3));
        System.out.println("- 10 min = "+lt1.minusMinutes(10));
        //сравнение
        System.out.println("lt1 > lt2 => "+lt1.isAfter(lt2));
        System.out.println("lt1 < lt2 => "+lt1.isBefore(lt2));

    }
}
