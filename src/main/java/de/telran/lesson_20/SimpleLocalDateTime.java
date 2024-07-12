package de.telran.lesson_20;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class SimpleLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println("Current = "+ldt1);

        LocalDateTime ldt2 = LocalDateTime.of(2023, Month.MARCH, 11, 10, 25,33);
        System.out.println("User = "+ldt2);

        System.out.println("Sec time = "+ldt1.getSecond());
        System.out.println("Day Of Year = "+ldt1.getDayOfYear());

        System.out.println("+ 3 hours = "+ldt1.plusHours(3));
        System.out.println("- 10 min = "+ldt1.minusMinutes(10));
        System.out.println("+ 10 day = "+ldt1.plus(10, ChronoUnit.DAYS)); // +10 дней

        //сравнение
        System.out.println("lt1 > lt2 => "+ldt1.isAfter(ldt2));
        System.out.println("lt1 < lt2 => "+ldt1.isBefore(ldt2));
        System.out.println("lt1 == lt2 => "+ldt1.isEqual(ldt2));

    }
}
